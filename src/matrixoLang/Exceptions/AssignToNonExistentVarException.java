package matrixoLang.Exceptions;

public class AssignToNonExistentVarException extends RuntimeException{
    public AssignToNonExistentVarException(String name, int line) {
        super("Line " + line + ". Can't assign to non-existent variable " + name + ".");
    }
}
