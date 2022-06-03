package matrixoLang;

import matrixoLang.Domain.Memory;
import matrixoLang.Domain.Value;
import matrixoLang.Exceptions.CallNonDefinedFunctionException;

public class matrixoFunctionVisitor extends matrixoBaseVisitor<Value>{

    private final Memory localMemory;

    public matrixoFunctionVisitor(Memory localMemory) {
        super();
        this.localMemory = localMemory;
    }

    //todo complete function visitor

    @Override public Value visitFunction_call(matrixoParser.Function_callContext ctx) {

        String fnName = ctx.IDENTIFIER().getText();
        if (localMemory.getFunctions().containsKey(fnName)) {
            System.out.println(localMemory.getFunction(fnName));
            return visit(localMemory.getFunction(fnName).getCtx().block());
        }
        // todo add inbuilt func
        else if (inbuiltFunctions.contains(fnName)) {
            // do stuff
            return null;
        }
        else throw new CallNonDefinedFunctionException(fnName, ctx.start.getLine());
    }
}
