package matrixoLang.Exceptions;

public class ColumnsRowsMismatchException extends RuntimeException{
    public ColumnsRowsMismatchException(int line, int cols, int rows) {
        super("Line " + line + ". Can't perform operation because the first operand has "+ cols + " columns, and the second has "+ rows + " rows.");
    }
}
