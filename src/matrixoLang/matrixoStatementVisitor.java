package matrixoLang;

import matrixoLang.Domain.Memory;
import matrixoLang.Domain.Value;

public class matrixoStatementVisitor extends matrixoBaseVisitor<Value>{
    private final Memory localMemory;

    public matrixoStatementVisitor(Memory localMemory) {
        super();
        this.localMemory = localMemory;
    }

    //todo complete statement visitor
}
