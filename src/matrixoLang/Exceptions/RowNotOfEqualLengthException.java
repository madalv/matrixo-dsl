package matrixoLang.Exceptions;

public class RowNotOfEqualLengthException extends RuntimeException{
    public RowNotOfEqualLengthException(int line) {
        super("Line " + line +  ". Matrix initialization failed, rows not equal in size.");
    }
}
