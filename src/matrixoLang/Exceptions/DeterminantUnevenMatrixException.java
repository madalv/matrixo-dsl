package matrixoLang.Exceptions;

public class DeterminantUnevenMatrixException extends RuntimeException{
    public DeterminantUnevenMatrixException() {
        super("Can't calculate the determninat because the number of rows and columns is not even.");
    }
}
