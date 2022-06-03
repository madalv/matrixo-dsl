package matrixoLang.Exceptions;
import matrixoLang.Domain.Function;

public class FunctionWithNameAlreadyDefinedException extends RuntimeException{
    public FunctionWithNameAlreadyDefinedException(Function signature, int line) {
        super("Line " + line+ ". Function " + signature.getName() + " already defined.");
    }
}
