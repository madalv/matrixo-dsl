package matrixoLang.Exceptions;

public class AttemptToAccessNonDefinedVarException extends RuntimeException{
    public AttemptToAccessNonDefinedVarException(String name, int line) {
        super("Line " + line + ". Attempt to access value of variable " + name + " failed because it is not yet defined or does not exist.");
    }
}
