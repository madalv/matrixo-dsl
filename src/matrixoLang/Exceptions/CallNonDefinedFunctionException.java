package matrixoLang.Exceptions;

public class CallNonDefinedFunctionException extends RuntimeException{
    public CallNonDefinedFunctionException(String name, int line) {
        super("Line " + line + ". Can't call function " + name + " because it is not defined yet.");
    }
}
