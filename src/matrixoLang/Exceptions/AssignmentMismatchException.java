package matrixoLang.Exceptions;

public class AssignmentMismatchException extends RuntimeException{
    public AssignmentMismatchException(String name) {
        super("Can't assign " + name + " to other types.");
    }
}
