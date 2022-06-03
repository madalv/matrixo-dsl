package matrixoLang.Exceptions;

public class ParameterArgumentNumberMismatchException extends RuntimeException{
    public ParameterArgumentNumberMismatchException (String call) {
        super("The number of arguments in the function call "  + call + " does not match function signature.");
    }
}
