package matrixoLang;

import matrixoLang.Domain.Function;
import matrixoLang.Domain.Memory;
import matrixoLang.Domain.Parameter;
import matrixoLang.Domain.Value;
import matrixoLang.Exceptions.CallNonDefinedFunctionException;
import matrixoLang.Exceptions.ParameterArgumentNumberMismatchException;
import matrixoLang.Exceptions.ParameterArgumentTypeMismatchException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class matrixoFunctionVisitor extends matrixoBaseVisitor<Value>{

    private final Memory localMemory;

    public matrixoFunctionVisitor(Memory localMemory) {
        super();
        this.localMemory = localMemory;
    }

    //todo complete function visitor

    public Value visitFunction_call(matrixoParser.Function_callContext ctx) {
        String fnName = ctx.IDENTIFIER().getText();
        if (localMemory.getFunctions().containsKey(fnName)) {
            // get values of arguments, pass them to local scope of function block
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

            Memory localMem = new Memory(localVars, localMemory.getFunctions());
            matrixoStatementVisitor SV = new matrixoStatementVisitor(localMem);
            //System.out.println(localMemory.getFunction(fnName));
            return SV.visitBlock(localMemory.getFunction(fnName).getCtx().block());

        }
        // todo add inbuilt func
        else if (inbuiltFunctions.contains(fnName)) {
            // do stuff
            return null;
        }
        else throw new CallNonDefinedFunctionException(fnName, ctx.start.getLine());
    }

    @Override public Value visitFunction_dec(matrixoParser.Function_decContext ctx) {

        Function fn = new Function(ctx.IDENTIFIER().getText(), ctx.return_type().getText(), visit(ctx.parameter_list()).getParameters(), ctx);
        localMemory.assignFunction(ctx.IDENTIFIER().getText(), fn);

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
}
