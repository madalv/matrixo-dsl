package matrixoLang.Exceptions;
import matrixoLang.Domain.Function;

public class FunctionWithNameAlreadyDefinedException extends RuntimeException{
    public FunctionWithNameAlreadyDefinedException(Function signature) {
        super("Function " + signature.getName() + " already defined.");
    }
}
