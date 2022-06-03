package matrixoLang.Exceptions;

public class AssignmentMismatchException extends RuntimeException{
    public AssignmentMismatchException(String type1, String type2, String var) {
        super("Can't assign " + type1 + " to " + type2 + ": variable " + var + ".");
    }
}
