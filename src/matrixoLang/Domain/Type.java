package matrixoLang.Domain;

public enum Type {
    MATRIX("matrix"), VECTOR("vector"),
    DOUBLE("double"), BOOLEAN("boolean"),
    VOID("void");

    public final String value;

    Type(String s) { value = s; }
}
