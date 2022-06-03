package matrixoLang;

import java.util.HashMap;
import java.util.Map;

public class Memory {
    private final Map<String, Value> variables = new HashMap<>();
    private final Map<String, Function> functions = new HashMap<>();

    public Value getLocalVar(String name) {
        return variables.get(name);
    }

    public Function getFunction(String name) {
        return functions.get(name);
    }

    public Map<String, Function> getFunctions() {
        return functions;
    }

    public Map<String, Value> getVariables() {
        return variables;
    }

    public void assignLocalVar(String name, Value value) {
        variables.put(name, value);
    }

    public void assignFunction(String name, Function function) {
        functions.put(name, function);
    }

    public void free() {
        variables.clear();
        functions.clear();
    }
}

