package matrixoLang;

import matrixoLang.Domain.Memory;
import matrixoLang.Domain.Type;
import matrixoLang.Domain.Value;
import matrixoLang.Exceptions.AssignToNonExistentVarException;
import matrixoLang.Exceptions.AssignmentMismatchException;
import matrixoLang.Exceptions.VariableAlreadyDefinedInScope;

import static matrixoLang.matrixoExpressionVisitor.SMALL_VALUE;

public class matrixoStatementVisitor extends matrixoBaseVisitor {
    private final Memory localMemory;

    public matrixoStatementVisitor(Memory localMemory) {
        super();
        this.localMemory = localMemory;
    }

    @Override public Value visitStatement(matrixoParser.StatementContext ctx) {

        if (ctx.semicolon_s() != null) return visitSemicolon_s(ctx.semicolon_s());
        else return visitNosemicolon_s(ctx.nosemicolon_s());

    }

    @Override public Value visitVariable_dec(matrixoParser.Variable_decContext ctx) {
        if (localMemory.getVariables().containsKey(ctx.IDENTIFIER().getText()))
            throw new VariableAlreadyDefinedInScope(ctx.start.getLine(), ctx.IDENTIFIER().getText());
        if (ctx.variable_init() != null) {
            Value v = visitVariable_init(ctx.variable_init());
            if (v.getType().equalsIgnoreCase(ctx.type().getText())) {
                localMemory.assignLocalVar(ctx.IDENTIFIER().getText(), v);
            }
            else throw new AssignmentMismatchException(ctx.type().getText(), v.getType(), ctx.IDENTIFIER().getText(), ctx.start.getLine());
        } else localMemory.assignLocalVar(ctx.IDENTIFIER().getText(), null);

        return null;
    }

    @Override public Value visitVariable_init(matrixoParser.Variable_initContext ctx) {
        matrixoExpressionVisitor EV = new matrixoExpressionVisitor(localMemory);
        return EV.visit(ctx.expression());
    }

    @Override public Value visitAssignment(matrixoParser.AssignmentContext ctx) {
        matrixoExpressionVisitor EV = new matrixoExpressionVisitor(localMemory);
        String varName = ctx.IDENTIFIER().getText();
        String op = ctx.ASSIGN_OP().getText();
        if (localMemory.getVariables().containsKey(varName)) {
            // case =
            // double - double, matrix - matrix
            // case all else
            // double - double, matrix - double, matrix - matrix
            Value val = localMemory.getLocalVar(varName);
            Value assigned = EV.visit(ctx.expression());
            String type1 = val.getType().toLowerCase();
            String type2 = assigned.getType().toLowerCase();


            // TODO: implement other assignment ops than =
            if (val == null ||type2.equals(type1) && op.equals("=")) {
                localMemory.getVariables().replace(varName, assigned);
            } else throw new AssignmentMismatchException(type1, type2, varName, ctx.start.getLine());

        } else throw new AssignToNonExistentVarException(varName, ctx.start.getLine());
        return null;
    }

    @Override public Value visitNosemicolon_s(matrixoParser.Nosemicolon_sContext ctx) {
        if (ctx.function_dec() != null) {
            matrixoFunctionVisitor FV = new matrixoFunctionVisitor(localMemory);
            return FV.visitFunction_dec(ctx.function_dec());
        }
        else if (ctx.block() != null) return visitBlock(ctx.block());
        else if (ctx.ctrlflow_s() != null) return  visitCtrlflow_s(ctx.ctrlflow_s());
        else return null;
    }

    @Override public Value visitSemicolon_s(matrixoParser.Semicolon_sContext ctx) {
        if (ctx.variable_dec() != null) return visitVariable_dec(ctx.variable_dec());
        else if (ctx.return_s() != null) {
            return visitReturn_s(ctx.return_s());
        }
        else if (ctx.assignment() != null) return visitAssignment(ctx.assignment());
        else if (ctx.expression() != null) {
            matrixoExpressionVisitor EV = new matrixoExpressionVisitor(localMemory);
            return EV.visit(ctx.expression());
        }
        else return null; // "break" not implemented yet
    }

    @Override public Value visitReturn_s(matrixoParser.Return_sContext ctx) {
        matrixoExpressionVisitor EV = new matrixoExpressionVisitor(localMemory);
        return EV.visit(ctx.expression());
    }

    @Override public Value visitCtrlflow_s(matrixoParser.Ctrlflow_sContext ctx) {
        if (ctx.for_s() != null) return visitFor_s(ctx.for_s());
        else if (ctx.if_s() != null) return visitIf_s(ctx.if_s());
        else return visitWhile_s(ctx.while_s());
    }

    @Override public Value visitFor_s(matrixoParser.For_sContext ctx) {

        matrixoExpressionVisitor EV = new matrixoExpressionVisitor(localMemory);
        Double from = EV.visit(ctx.expression(0)).getDouble();
        Double to = EV.visit(ctx.expression(1)).getDouble();
        String forLoopVar = ctx.IDENTIFIER().getText();
        localMemory.assignLocalVar(forLoopVar, new Value(from, Type.DOUBLE.value));

        while (Math.abs(from - to) >= SMALL_VALUE) {
            if (ctx.statement().semicolon_s() != null && ctx.statement().semicolon_s().return_s() != null)
                return visitStatement(ctx.statement());
            visitStatement(ctx.statement());
            from++;
            localMemory.getVariables().replace(forLoopVar, new Value(from, Type.DOUBLE.value));
        }

        return null;
    }

    @Override public Value visitIf_s(matrixoParser.If_sContext ctx) {
        matrixoExpressionVisitor EV = new matrixoExpressionVisitor(localMemory);
        Boolean evaluated = EV.visit(ctx.expression()).getBoolean();


        if (evaluated) {
            return visitStatement(ctx.statement());
        } else if (ctx.else_s() != null) return visitElse_s(ctx.else_s());

        return null;
    }

    @Override public Value visitElse_s(matrixoParser.Else_sContext ctx) {
        if (ctx.if_s() != null) return visitIf_s(ctx.if_s());
        else return visitStatement(ctx.statement());
    }

    @Override public Value visitWhile_s(matrixoParser.While_sContext ctx) {
        matrixoExpressionVisitor EV = new matrixoExpressionVisitor(localMemory);
        Boolean evaluated = EV.visit(ctx.expression()).getBoolean();

        while (evaluated) {
            if (ctx.statement().semicolon_s() != null && ctx.statement().semicolon_s().return_s() != null)
                return visitStatement(ctx.statement());
            visitStatement(ctx.statement());
            evaluated = EV.visit(ctx.expression()).getBoolean();
        }
        return null;
    }

    @Override public Value visitBlock(matrixoParser.BlockContext ctx) {

        for (matrixoParser.StatementContext child : ctx.statement()) {
            // the ONLY return we need is the value of the return statement in case of function blocks
            if (child.semicolon_s() != null && child.semicolon_s().return_s() != null) return visitStatement(child);
            visitStatement(child);
        }
        return null;
    }
}
