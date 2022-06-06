package matrixoLang.Exceptions;

public class NonNumericValueException extends RuntimeException{
    public NonNumericValueException(int line) {
        super("Line " + line + ". This excel sheet contains non-numeric values.");
    }
}
