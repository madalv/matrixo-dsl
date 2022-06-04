package matrixoLang;

import matrixoLang.Domain.*;
import matrixoLang.Exceptions.AttemptToAccessNonDefinedVarException;
import matrixoLang.Exceptions.CallNonDefinedFunctionException;
import matrixoLang.Exceptions.ParameterArgumentNumberMismatchException;
import matrixoLang.Exceptions.ParameterArgumentTypeMismatchException;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class matrixoExpressionVisitor extends matrixoBaseVisitor<Value>{
    private final Memory localMemory;

    public matrixoExpressionVisitor(Memory localMemory) {
        super();
        this.localMemory = localMemory;
    }

    @Override public Value visitBoolOp(matrixoParser.BoolOpContext ctx) {

        return visitChildren(ctx);
    }

    @Override public Value visitAtomExp(matrixoParser.AtomExpContext ctx) { return visitAtom(ctx.atom()); }

    @Override public Value visitSqrtExp(matrixoParser.SqrtExpContext ctx) { return visitChildren(ctx); }

    @Override public Value visitPrefixExp(matrixoParser.PrefixExpContext ctx) { return visitChildren(ctx); }

    @Override public Value visitPowerExp(matrixoParser.PowerExpContext ctx) { return visitChildren(ctx); }

    //todo remove placeholder
    @Override public Value visitImportCall(matrixoParser.ImportCallContext ctx) { return new Value(new Matrix(), "matrix"); }

    //todo getCall
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
            for (int i = 0; i < ctx.getChildCount() - 1; i++) { // get the rows
                ArrayList<Double> row = visitRow(ctx.row(i)).getList();
                m.add(row);
            }
            return new Value(m, "matrix");
        }
    }


    //todo remove placeholders in get, import
    @Override public Value visitGet_call(matrixoParser.Get_callContext ctx) { return visitChildren(ctx); }

    @Override public Value visitImport_call(matrixoParser.Import_callContext ctx) { return visitChildren(ctx); }

    @Override public Value visitParanthesis_expr(matrixoParser.Paranthesis_exprContext ctx) { return visit(ctx.expression()); }
}
