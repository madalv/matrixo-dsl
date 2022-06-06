package matrixoLang.Exceptions;

public class ImportMismatchException extends RuntimeException {
    public ImportMismatchException(int line, String promisedType, String gotType) {
        super("Line " + line + ". Import call promised type " + promisedType + " but imported type " +gotType + "." );
    }
}
