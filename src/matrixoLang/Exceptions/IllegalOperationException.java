package matrixoLang.Exceptions;

import matrixoLang.Domain.Value;

public class IllegalOperationException extends RuntimeException{
    public IllegalOperationException(Value val, int line, String op) {
        super("Line " + line + ". Illegal operation: can't perform operation \"" + op + "\" on type " + val.getType() + ".");
    }
}
