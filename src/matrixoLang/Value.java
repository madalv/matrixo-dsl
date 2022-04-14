package matrixoLang;

import java.util.ArrayList;

public class Value {
    private Object value;

    public Value(Matrix<?> v) {
            value = v.getValue();
    }

    public Value(Vector<?> v) {
        value = v.getValue();
    }

    public Value(Integer v) {
        value = v;
    }

    public Value(Double v) {
        value = v;
    }

    public Value(Boolean v) {
        value = v;
   }

    public Value(String id) {
        value = null;
    }

    public Value(ArrayList<?> v) {
        value = v;
    }

    public Object getValue() {
        return value;
    }

    public ArrayList<?> getVector() {
        return (ArrayList<?>) value;
    }


}
