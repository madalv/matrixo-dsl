package matrixoLang.Exceptions;
import matrixoLang.*;

public class FunctionWithNameAlreadyDefinedException extends RuntimeException{
    public FunctionWithNameAlreadyDefinedException(Function signature) {
        super("Function " + signature.getName() + " already defined.");
    }
}
