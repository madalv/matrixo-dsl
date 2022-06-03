package matrixoLang.Exceptions;

public class CallNonDefinedFunctionException extends RuntimeException{
    public CallNonDefinedFunctionException(String name) {
        super("Can't call function " + name + " because it is not defined yet.");
    }
}
