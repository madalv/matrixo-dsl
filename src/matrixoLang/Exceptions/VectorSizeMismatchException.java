package matrixoLang.Exceptions;

import matrixoLang.Domain.Vector;

public class VectorSizeMismatchException extends RuntimeException{
    public VectorSizeMismatchException(int line) {
        super("Line " + line + ". Operation cannot be completed because rows are of 2 different sizes." );
    }
}
