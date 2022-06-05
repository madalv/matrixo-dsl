package matrixoLang.Exceptions;

public class UnknownOperatorException extends RuntimeException{
    public UnknownOperatorException(int line, String op) {
        super("Line " + line + ". Operator " + op + " is unsupported.");
    }
}
