package matrixoLang.Exceptions;

import matrixoLang.Domain.Value;

import java.util.List;
import java.util.stream.Collectors;

public class IllegalOperationException extends RuntimeException{
    public IllegalOperationException(List<Value> val, int line, String op) {
        super("Line " + line + ". Illegal operation: can't perform operation \"" + op + "\" on type(s) " +
                val.stream().map(Value::getType).collect(Collectors.joining(", ", "", "")) + ".");
    }
}
