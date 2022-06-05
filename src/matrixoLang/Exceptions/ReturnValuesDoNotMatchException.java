package matrixoLang.Exceptions;

public class ReturnValuesDoNotMatchException extends RuntimeException{
    public ReturnValuesDoNotMatchException(int line, String fnName, String promisedType, String actualType) {
        super("Line " + line + ". Function " + fnName + " promises " + promisedType + " return type, but delivers " + actualType + ".");
    }
}
