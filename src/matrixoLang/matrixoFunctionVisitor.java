package matrixoLang;

import matrixoLang.Domain.*;
import matrixoLang.Exceptions.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class matrixoFunctionVisitor extends matrixoBaseVisitor {

    private final Memory localMemory;

    public matrixoFunctionVisitor(Memory localMemory) {
        super();
        this.localMemory = localMemory;
    }

    private Map<String, Value> getVariablesLocalScope(String fnName, matrixoParser.Function_callContext ctx) {
        Map<String, Value> localVars = new LinkedHashMap<>();
        List<Parameter> params = localMemory.getFunction(fnName).getParameters();
        ArrayList<Value> args = visitArgument_list(ctx.argument_list()).getArgList();

        try {
            if (params.size() == args.size()) {
                for (int i = 0; i < params.size(); i++) {
                    Parameter p = params.get(i);
                    Value v = args.get(i);
                    if (!p.getType().equals(v.getType())) throw new ParameterArgumentTypeMismatchException(ctx.getText(), p, v, ctx.start.getLine());
                    else localVars.put(params.get(i).getName(), v);
                }
            } else throw new ParameterArgumentNumberMismatchException(ctx.getText(), ctx.start.getLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return localVars;
    }

    public Value visitFunction_call(matrixoParser.Function_callContext ctx) {
        String fnName = ctx.IDENTIFIER().getText();
        if (localMemory.getFunctions().containsKey(fnName)) {
            // get values of arguments, pass them to local scope of function block
            Memory localMem = new Memory(getVariablesLocalScope(fnName, ctx), localMemory.getFunctions());
            matrixoStatementVisitor SV = new matrixoStatementVisitor(localMem);
            Value returnValue = SV.visitBlock(localMemory.getFunction(fnName).getCtx().block());
            String promisedRetType = localMemory.getFunction(fnName).getReturnType();

            if (localMemory.getFunction(fnName).getReturnType().equals(Type.VOID.value) && returnValue == null) {
                SV.visitBlock(localMemory.getFunction(fnName).getCtx().block());
                return null;
            } else {
                if (!returnValue.getType().equals(promisedRetType))
                    throw new ReturnValuesDoNotMatchException(ctx.start.getLine(), fnName, promisedRetType, returnValue.getType());
                return returnValue;
            }
        }
        // todo add inbuilt funcs
        else if (inbuiltFunctions.contains(fnName)) {
            if (fnName.equalsIgnoreCase("print")) {
                ArrayList<Value> args = visitArgument_list(ctx.argument_list()).getArgList();
                args.forEach(System.out::println);
                return null;
            }
            return null;
        }
        else throw new CallNonDefinedFunctionException(fnName, ctx.start.getLine());
    }

    @Override public Value visitFunction_dec(matrixoParser.Function_decContext ctx) {
        String fnName = ctx.IDENTIFIER().getText();
        if (localMemory.getFunctions().containsKey(fnName)) throw new FunctionWithNameAlreadyDefinedException(fnName, ctx.start.getLine());
        Function fn = new Function(fnName, ctx.return_type().getText().toLowerCase(), visitParameter_list(ctx.parameter_list()).getParameters(), ctx);
        localMemory.assignFunction(fnName, fn);
        return null;
    }

    @Override public Value visitArgument_list(matrixoParser.Argument_listContext ctx) {
        matrixoExpressionVisitor EV = new matrixoExpressionVisitor(localMemory);
        ArrayList<Value> args = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            if (!child.getText().equals(","))
                args.add(EV.visit(child));
        }
        return new Value(args);
    }

    @Override public Value visitParameter_list(matrixoParser.Parameter_listContext ctx) {

        ArrayList<Parameter> ps = new ArrayList<>();
        for (matrixoParser.ParameterContext child : ctx.parameter()) {
            ps.add(visitParameter(child).getParameter());
        }
        return new Value(ps);
    }

    @Override public Value visitParameter(matrixoParser.ParameterContext ctx) {
        return new Value(new Parameter(ctx.IDENTIFIER().getText(), ctx.type().getText()));
    }
}
