package matrixoLang.Exceptions;

public class AttemptToGetUnknownFunctionException extends RuntimeException{
    public AttemptToGetUnknownFunctionException(int line, String fnName) {
        super("Line " + line + ". Get call cannot resolve function " + fnName + " because it is not inbuilt.");
    }
}
