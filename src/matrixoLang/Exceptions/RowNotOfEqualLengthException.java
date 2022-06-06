package matrixoLang.Exceptions;

public class RowNotOfEqualLengthException extends RuntimeException{
    public RowNotOfEqualLengthException(int line) {
        super("Line " + line +  ". Rows of the matrix initialized are not equal in size.");
    }
}
