package matrixoLang.Exceptions;

public class VariableAlreadyDefinedInScope extends RuntimeException{
    public VariableAlreadyDefinedInScope(int line, String name) {
        super("Line " + line + ". Variable " + name + " already defined in scope.");
    }
}
