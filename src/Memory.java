import java.util.HashMap;
import java.util.Map;

public class Memory {
    private final Map<String, Value> memory = new HashMap<>();

    public Value get(String name) {
        return memory.get(name);
    }

    public void assign(String name, Value value) {
        memory.put(name, value);
    }

    public void free() {
        memory.clear();
    }
}

