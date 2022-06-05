package matrixoLang.Exceptions;

public class FunctionWithNameAlreadyDefinedException extends RuntimeException{
    public FunctionWithNameAlreadyDefinedException(String name, int line) {
        super("Line " + line+ ". Function " + name + " already defined.");
    }
}
