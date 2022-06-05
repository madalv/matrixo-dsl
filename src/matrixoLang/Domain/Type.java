package matrixoLang.Domain;

public enum Type {
    MATRIX("matrix"), VECTOR("vector"),
    INT("int"), DOUBLE("double"), BOOLEAN("boolean");


    public String value;

    Type(String s) { value = s; }
    Type() {}
}
