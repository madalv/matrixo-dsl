package matrixoLang;

import matrixoLang.Domain.Memory;
import matrixoLang.Domain.Value;
import matrixoLang.Exceptions.AssignToNonExistentVarException;
import matrixoLang.Exceptions.AssignmentMismatchException;
import org.antlr.v4.runtime.tree.ParseTree;

public class matrixoStatementVisitor extends matrixoBaseVisitor<Value>{
    private final Memory localMemory;

    public matrixoStatementVisitor(Memory localMemory) {
        super();
        this.localMemory = localMemory;
    }

    @Override public Value visitVariable_dec(matrixoParser.Variable_decContext ctx) {
//        System.out.println(globalMemory);
//        System.out.println(localMemory);
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
        //System.out.println(ctx.getText());
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
            //System.out.println(visitReturn_s(ctx.return_s()));
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
        return visitChildren(ctx); }

    //TODO visitFor_s
    @Override public Value visitFor_s(matrixoParser.For_sContext ctx) { return visitChildren(ctx); }


    @Override public Value visitIf_s(matrixoParser.If_sContext ctx) {
        matrixoExpressionVisitor EV = new matrixoExpressionVisitor(localMemory);
        Boolean evaluated = EV.visit(ctx.expression()).getBoolean();

        if (evaluated) {
            visitStatement(ctx.statement());
        }
        return null;
    }

    @Override public Value visitElse_s(matrixoParser.Else_sContext ctx) {
        matrixoExpressionVisitor EV = new matrixoExpressionVisitor(localMemory);

        if (ctx.if_s() != null) return visitIf_s(ctx.if_s());
        else return visitStatement(ctx.statement());
    }

    @Override public Value visitWhile_s(matrixoParser.While_sContext ctx) { return visitChildren(ctx); }

    @Override public Value visitBlock(matrixoParser.BlockContext ctx) {

        for (matrixoParser.StatementContext child : ctx.statement()) {
            Value res = visitStatement(child);
//            System.out.println(child.getText());
//            System.out.println(res);
            if (res != null) return res;
        }
        return null;
    }
}
