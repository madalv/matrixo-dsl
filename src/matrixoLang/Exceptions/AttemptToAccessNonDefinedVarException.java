package matrixoLang.Exceptions;

public class AttemptToAccessNonDefinedVarException extends RuntimeException{
    public AttemptToAccessNonDefinedVarException(String name) {
        super("Attempt to access value of " + name + " failed because it is not yet defined or does not exist.");
    }
}
