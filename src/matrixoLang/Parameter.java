package matrixoLang;

public class Parameter {
    private final String name;
    private final String type;

    public Parameter(String name, String type) {
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Parameter{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

