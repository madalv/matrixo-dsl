package matrixoLang.Exceptions;

public class AssignToNonExistentVarException extends RuntimeException{
    public AssignToNonExistentVarException(String name) {
        super("Can't assign to non-existent variable " + name + ".");
    }
}
