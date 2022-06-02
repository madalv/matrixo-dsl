package matrixoLang;

import java.util.ArrayList;

public class Value {
    private Object value;

    public Value(Matrix v) {
            value = v.getValue();
    }

    public Value(Vector v) {
        value = v.getValue();
    }

    public Value(Integer v) {
        value = v;
    }

    public Value(Double v) {
        value = v;
    }

    public Value(Boolean v) {value = v; }

    public Value(String id) {
        value = null;
    }

    public Value(ArrayList<?> v) {
        value = v;
    }

    public Object getNull() {
        return null;
    }

    public ArrayList<Double> getList() {
        return (ArrayList<Double>) value;
    }

    public ArrayList<Double> getMatrix() {
        if (value instanceof ArrayList<?>) {
            if (((ArrayList<?>) value).size() > 1) return (ArrayList<Double>) value;
        }
        return null;
    }

    public ArrayList<Double> getVector() {
        if (value instanceof ArrayList<?>) {
            if (((ArrayList<?>) value).size() == 1) return (ArrayList<Double>) value;
        }
        return null;
    }

    public Integer getInteger() { return (Integer) value; }

    public String getString() {
        return (String) value;
    }

    public Double getDouble() { return (Double) value; }

    @Override
    public String toString() {
        return value.toString();
    }
}
