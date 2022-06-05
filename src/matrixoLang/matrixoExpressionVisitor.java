package matrixoLang;

import matrixoLang.Domain.*;
import matrixoLang.Exceptions.*;

import java.util.ArrayList;
import java.util.List;

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
                    if (left.getType().equals(right.getType()) && left.getType().equals(Type.DOUBLE.value)) {
                        Boolean res = Math.abs(left.getDouble() - right.getDouble()) < SMALL_VALUE;
                        return new Value(res, Type.BOOLEAN.value);
                    } else if (left.getType().equals(right.getType()) && left.getType().equals(Type.MATRIX.value)) {
                        return new Value(left.getMatrix().getValue().equals(right.getMatrix().getValue()), Type.BOOLEAN.value);
                    } else if (left.getType().equals(right.getType()) && left.getType().equals(Type.VECTOR.value)) {
                    return new Value(left.getVector().getValue().equals(right.getVector().getValue()), Type.BOOLEAN.value);
                    }
                    break;
                case "!=":
                    if (left.getType().equals(right.getType()) && left.getType().equals(Type.DOUBLE.value)) {
                        Boolean res = Math.abs(left.getDouble() - right.getDouble()) >= SMALL_VALUE;
                        return new Value(res, Type.BOOLEAN.value);
                    } else if (left.getType().equals(right.getType()))
                        return new Value(!left.equals(right), Type.BOOLEAN.value);
                    break;
                case "&&":
                case "and":
                    return new Value(left.getBoolean() && right.getBoolean(), Type.BOOLEAN.value);
                case "||":
                case "or":
                    return new Value(left.getBoolean() || right.getBoolean(), Type.BOOLEAN.value);
                case "<":
                    return new Value(left.getDouble() < right.getDouble(), Type.BOOLEAN.value);
                case ">":
                    return new Value(left.getDouble() > right.getDouble(), Type.BOOLEAN.value);
                case ">=":
                    return new Value(left.getDouble() >= right.getDouble(), Type.BOOLEAN.value);
                case "<=":
                    return new Value(left.getDouble() <= right.getDouble(), Type.BOOLEAN.value);
                default: throw new UnknownOperatorException(ctx.start.getLine(), ctx.BOOL_OP().getText());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return visitChildren(ctx);
    }

    @Override public Value visitAtomExp(matrixoParser.AtomExpContext ctx) { return visitAtom(ctx.atom()); }

    @Override public Value visitSqrtExp(matrixoParser.SqrtExpContext ctx) {
        Value v = visitAtom(ctx.atom());
        if (!v.getType().equals(Type.DOUBLE.value)) throw new IllegalOperationException(new ArrayList<>(List.of(v)), ctx.start.getLine(), "%% (sqrt)");
        return new Value(Math.sqrt(v.getDouble()), Type.DOUBLE.value);
    }

    @Override public Value visitPrefixExp(matrixoParser.PrefixExpContext ctx) {

        switch (ctx.PREFIX_OP().getText()) {
            case "++":
                Value val = this.visitAtom(ctx.atom());
                if (!val.getType().equals(Type.DOUBLE.value)) throw new IllegalOperationException(new ArrayList<>(List.of(val)), ctx.start.getLine(), ctx.PREFIX_OP().getText());
                return new Value(val.getDouble() + 1, Type.DOUBLE.value);
            case "--":
                val = this.visitAtom(ctx.atom());
                if (!val.getType().equals(Type.DOUBLE.value)) throw new IllegalOperationException(new ArrayList<>(List.of(val)), ctx.start.getLine(), ctx.PREFIX_OP().getText());
                return new Value(val.getDouble() - 1, Type.DOUBLE.value);
            default: throw new UnknownOperatorException(ctx.start.getLine(), ctx.PREFIX_OP().getText());
        }
    }

    @Override public Value visitPowerExp(matrixoParser.PowerExpContext ctx) {
        Value base = this.visit(ctx.expression(0));
        Value exp = this.visit(ctx.expression(1));
        if (!base.getType().equals(Type.DOUBLE.value) || !base.getType().equals(exp.getType()))
            throw new IllegalOperationException(new ArrayList<>(List.of(base)), ctx.start.getLine(), "** (power)");
        return new Value(Math.pow(base.getDouble(), exp.getDouble()), Type.DOUBLE.value);
    }

    // todo add matrix operations for expressions, assignment & get call
    @Override public Value visitFirstOrdExp(matrixoParser.FirstOrdExpContext ctx) {
        Value v1 = this.visit(ctx.expression(0));
        Value v2 = this.visit(ctx.expression(1));
        String type1 = v1.getType();
        String type2 = v2.getType();

        // complete with matrix functions and error
        switch (ctx.FIRST_ORDER_OP().getText()){
            case "*":
                if (type1.equals(type2)) {
                    if (type1.equals(Type.MATRIX.value)) {

                    }
                    if (type1.equals(Type.VECTOR.value)) {

                    }
                    if (type1.equals(Type.DOUBLE.value)) {
                        return new Value(v1.getDouble() * v2.getDouble(), Type.DOUBLE.value);
                    }
                } else if (type1.equals(Type.MATRIX.value) && type2.equals(Type.DOUBLE.value)) {

                } else if (type1.equals(Type.VECTOR.value) && type2.equals(Type.DOUBLE.value)) {

                }
                else throw new IllegalOperationException(new ArrayList<>(List.of(v1, v2)), ctx.start.getLine(), ctx.FIRST_ORDER_OP().getText());
                break;
            case "/":
                if (type1.equals(type2) && type1.equals(Type.DOUBLE.value))
                    return new Value(v1.getDouble() / v2.getDouble(), Type.DOUBLE.value);
                 else if (type1.equals(Type.MATRIX.value) && type2.equals(Type.DOUBLE.value)) {

                } else if (type1.equals(Type.VECTOR.value) && type2.equals(Type.DOUBLE.value)){

                }
                else throw new IllegalOperationException(new ArrayList<>(List.of(v1, v2)), ctx.start.getLine(), ctx.FIRST_ORDER_OP().getText());
                break;
            case "%":
                if (type1.equals(type2) && type1.equals(Type.DOUBLE.value))
                    return new Value(v1.getDouble() % v2.getDouble(), Type.DOUBLE.value);
                else throw new IllegalOperationException(new ArrayList<>(List.of(v1, v2)), ctx.start.getLine(), ctx.FIRST_ORDER_OP().getText());
            default: throw new UnknownOperatorException(ctx.start.getLine(), ctx.FIRST_ORDER_OP().getText());
        }

        return null;
    }

    @Override public Value visitSecondOrdExp(matrixoParser.SecondOrdExpContext ctx) {
        Value v1 = this.visit(ctx.expression(0));
        Value v2 = this.visit(ctx.expression(1));
        String type1 = v1.getType();
        String type2 = v2.getType();

        switch (ctx.SECOND_ORDER_OP().getText()){
            case "+":
                if (type1.equals(type2)) {
                    if (type1.equals(Type.MATRIX.value)) {

                    }
                    if (type1.equals(Type.VECTOR.value)) {

                    }
                    if (type1.equals(Type.DOUBLE.value)) {
                        return new Value(v1.getDouble() + v2.getDouble(), Type.DOUBLE.value);
                    }
                } else if (type1.equals(Type.MATRIX.value) && type2.equals(Type.DOUBLE.value)) {

                } else if (type1.equals(Type.VECTOR.value) && type2.equals(Type.DOUBLE.value)) {

                }
                else throw new IllegalOperationException(new ArrayList<>(List.of(v1, v2)), ctx.start.getLine(), ctx.SECOND_ORDER_OP().getText());
                break;
            case "-":
                if (type1.equals(type2)) {
                    if (type1.equals(Type.MATRIX.value)) {

                    }
                    if (type1.equals(Type.VECTOR.value)) {

                    }
                    if (type1.equals(Type.DOUBLE.value)) {
                        return new Value(v1.getDouble() - v2.getDouble(), Type.DOUBLE.value);
                    }
                } else if (type1.equals(Type.MATRIX.value) && type2.equals(Type.DOUBLE.value)) {

                } else if (type1.equals(Type.VECTOR.value) && type2.equals(Type.DOUBLE.value)) {

                }
                else throw new IllegalOperationException(new ArrayList<>(List.of(v1, v2)), ctx.start.getLine(), ctx.SECOND_ORDER_OP().getText());
                break;
            default: throw new UnknownOperatorException(ctx.start.getLine(), ctx.SECOND_ORDER_OP().getText());
        }

        return null;
    }

    @Override public Value visitAtom(matrixoParser.AtomContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            if (localMemory.getVariables().containsKey(ctx.IDENTIFIER().getText())) return localMemory.getLocalVar(ctx.IDENTIFIER().getText());
            else throw new AttemptToAccessNonDefinedVarException(ctx.IDENTIFIER().getText(), ctx.start.getLine());
        } else if (ctx.TRUE() != null) return new Value(Boolean.TRUE, Type.BOOLEAN.value);
        else if (ctx.FALSE() != null) return new Value(Boolean.FALSE, Type.BOOLEAN.value);
        else if (ctx.NUMBER() != null) return new Value(Double.parseDouble(ctx.NUMBER().getText()), Type.DOUBLE.value);
        else if (ctx.paranthesis_expr() != null) return visitParanthesis_expr(ctx.paranthesis_expr());
        else {
            matrixoFunctionVisitor FV = new matrixoFunctionVisitor(localMemory);
            return FV.visitFunction_call(ctx.function_call());
        }
    }

    @Override public Value visitMatrixInit(matrixoParser.MatrixInitContext ctx) {
        return visit(ctx.matrix_init());
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

    @Override public Value visitImportCall(matrixoParser.ImportCallContext ctx) { return visitImport_call(ctx.import_call()); }

    @Override public Value visitGetCall(matrixoParser.GetCallContext ctx) { return visitGet_call(ctx.get_call()); }

    @Override public Value visitGet_call(matrixoParser.Get_callContext ctx) { return visitChildren(ctx); }

    @Override public Value visitImport_call(matrixoParser.Import_callContext ctx) { return visitChildren(ctx); }

    @Override public Value visitParanthesis_expr(matrixoParser.Paranthesis_exprContext ctx) { return this.visit(ctx.expression()); }
}
