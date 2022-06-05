package matrixoLang;

import matrixoLang.Domain.*;
import matrixoLang.Exceptions.*;

import java.util.ArrayList;

public class matrixoExpressionVisitor extends matrixoBaseVisitor {
    private final Memory localMemory;
    public static final double SMALL_VALUE = 0.00000000001;

    public matrixoExpressionVisitor(Memory localMemory) {
        super();
        this.localMemory = localMemory;
    }

    @Override public Value visitBoolOp(matrixoParser.BoolOpContext ctx) {

        Value left = visit(ctx.expression(0));
        Value right = visit(ctx.expression(1));


        try {
            switch (ctx.BOOL_OP().getText()) {
                case "==":
                    if (left.getType().equals(right.getType()) && left.getType().equals("double")) {
                        Boolean res = Math.abs(left.getDouble() - right.getDouble()) < SMALL_VALUE;
                        return new Value(res, "boolean");
                    } else if (left.getType().equals(right.getType()))
                        return new Value(left.equals(right), "boolean");
                    break;
                case "!=":
                    if (left.getType().equals(right.getType()) && left.getType().equals("double")) {
                        Boolean res = Math.abs(left.getDouble() - right.getDouble()) >= SMALL_VALUE;
                        return new Value(res, "boolean");
                    } else if (left.getType().equals(right.getType()))
                        return new Value(!left.equals(right), "boolean");
                    break;
                case "&&":
                case "and":
                    return new Value(left.getBoolean() && right.getBoolean(), "boolean");
                case "||":
                case "or":
                    return new Value(left.getBoolean() || right.getBoolean(), "boolean");
                case "<":
                    return new Value(left.getDouble() < right.getDouble(), "boolean");
                case ">":
                    return new Value(left.getDouble() > right.getDouble(), "boolean");
                case ">=":
                    return new Value(left.getDouble() >= right.getDouble(), "boolean");
                case "<=":
                    return new Value(left.getDouble() <= right.getDouble(), "boolean");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return visitChildren(ctx);
    }

    @Override public Value visitAtomExp(matrixoParser.AtomExpContext ctx) { return visitAtom(ctx.atom()); }

    @Override public Value visitSqrtExp(matrixoParser.SqrtExpContext ctx) { return visitChildren(ctx); }

    @Override public Value visitPrefixExp(matrixoParser.PrefixExpContext ctx) {

        switch (ctx.PREFIX_OP().getText()) {
            case "++":
                Value val = this.visitAtom(ctx.atom());
                if (!val.getType().equals(Type.DOUBLE.value)) throw new IllegalOperationException(val, ctx.start.getLine(), ctx.PREFIX_OP().getText());
                return new Value(val.getDouble() + 1, Type.DOUBLE.value);
            case "--":
                val = this.visitAtom(ctx.atom());
                if (!val.getType().equals(Type.DOUBLE.value)) throw new IllegalOperationException(val, ctx.start.getLine(), ctx.PREFIX_OP().getText());
                return new Value(val.getDouble() - 1, Type.DOUBLE.value);
            default: throw new UnknownOperatorException(ctx.start.getLine(), ctx.PREFIX_OP().getText());
        }
    }

    @Override public Value visitPowerExp(matrixoParser.PowerExpContext ctx) { return visitChildren(ctx); }

    @Override public Value visitImportCall(matrixoParser.ImportCallContext ctx) { return new Value(new Matrix(), Type.MATRIX.value); }

    //todo getCall, importCall
    @Override public Value visitGetCall(matrixoParser.GetCallContext ctx) { return visit(ctx.get_call()); }

    @Override public Value visitFirstOrdExp(matrixoParser.FirstOrdExpContext ctx) { return visitChildren(ctx); }

    @Override public Value visitMatrixInit(matrixoParser.MatrixInitContext ctx) {
        return visit(ctx.matrix_init());
    }

    @Override public Value visitSecondOrdExp(matrixoParser.SecondOrdExpContext ctx) { return visitChildren(ctx); }

    @Override public Value visitAtom(matrixoParser.AtomContext ctx) {

        if (ctx.IDENTIFIER() != null) {
            if (localMemory.getVariables().containsKey(ctx.IDENTIFIER().getText())) return localMemory.getLocalVar(ctx.IDENTIFIER().getText());
            else throw new AttemptToAccessNonDefinedVarException(ctx.IDENTIFIER().getText(), ctx.start.getLine());
        } else if (ctx.TRUE() != null) return new Value(Boolean.TRUE, "bool");
        else if (ctx.FALSE() != null) return new Value(Boolean.FALSE, "bool");
        else if (ctx.NUMBER() != null) return new Value(Double.parseDouble(ctx.NUMBER().getText()), "double");
        else if (ctx.paranthesis_expr() != null) return visitParanthesis_expr(ctx.paranthesis_expr());
        else {
            matrixoFunctionVisitor FV = new matrixoFunctionVisitor(localMemory);
            return FV.visitFunction_call(ctx.function_call());
        }
    }

    @Override public Value visitMatrix_init(matrixoParser.Matrix_initContext ctx) {

        if (ctx.getChildCount() == 2) {
            Vector v = new Vector(visitRow(ctx.row(0)).getList());
            return new Value(v, "vector");
        } else {
            Matrix m = new Matrix();
            int rowSize = visitRow(ctx.row(0)).getList().size();
            for (int i = 0; i < ctx.getChildCount() - 1; i++) { // get the rows
                ArrayList<Double> row = visitRow(ctx.row(i)).getList();
                if (row.size() != rowSize) throw new RowNotOfEqualLengthException(ctx.start.getLine());
                m.add(row);
            }
            return new Value(m, Type.MATRIX.value);
        }
    }

    @Override public Value visitRow(matrixoParser.RowContext ctx) {
        ArrayList<Double> v = new ArrayList<>();
        for (var node : ctx.children) {
            String text = node.getText();
            if (text.equals(",") || text.equals(")")) continue;
            Double d = Double.parseDouble(text);
            v.add(d);
        }
        return new Value(v);
    }

    //todo remove placeholders in get, import
    @Override public Value visitGet_call(matrixoParser.Get_callContext ctx) { return visitChildren(ctx); }

    @Override public Value visitImport_call(matrixoParser.Import_callContext ctx) { return visitChildren(ctx); }

    @Override public Value visitParanthesis_expr(matrixoParser.Paranthesis_exprContext ctx) { return visit(ctx.expression()); }
}
