package matrixoLang;

import matrixoLang.Domain.Memory;
import matrixoLang.Domain.Value;

public class matrixoExpressionVisitor extends matrixoBaseVisitor<Value>{
    private final Memory localMemory;

    public matrixoExpressionVisitor(Memory localMemory) {
        super();
        this.localMemory = localMemory;
    }

    //todo complete expression visitor

}
