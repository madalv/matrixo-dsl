package matrixoLang.Exceptions;

public class InbuiltGetFunctionException extends RuntimeException{
    public InbuiltGetFunctionException(int line, String fnName) {
        super("Line " + line + ". Use function "  +fnName + " with the get call.");
    }
}
