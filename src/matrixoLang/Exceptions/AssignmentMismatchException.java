package matrixoLang.Exceptions;

public class AssignmentMismatchException extends RuntimeException{
    public AssignmentMismatchException(String type1, String type2, String var, int line) {
        super("Line " + line + ". Can't assign " + type2 + " to " + type1 + ": variable " + var + ".");
    }
}
