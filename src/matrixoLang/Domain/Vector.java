package matrixoLang.Domain;


import Jama.EigenvalueDecomposition;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class Vector{
    private ArrayList<Double> value;

    public Vector(ArrayList<Double> a) {
        value = a;
    }

    public ArrayList<Double> getValue() {
        return value;
    }

    public static Vector MultiplyScalar(Vector v, Double scalar) {
        ArrayList<Double> vec = new ArrayList<>();
        v.getValue().forEach(d -> vec.add(d * scalar));
        return new Vector(vec);
    }

    public static Vector AddScalar(Vector v, Double scalar) {
        ArrayList<Double> vec = new ArrayList<>();
        v.getValue().forEach(d -> vec.add(d + scalar));
        return new Vector(vec);
    }

    public static Vector Add(Vector v, Vector u) {
        ArrayList<Double> vec = new ArrayList<>();
        for (int i = 0; i < v.getValue().size(); i++) {
            vec.add(v.getValue().get(i) + u.getValue().get(i));
        }
        return new Vector(vec);
    }

    public static Double DotProduct(Vector v, Vector u) {
        double s = 0;
        for (int i = 0; i < v.getValue().size(); i++) {
            s += v.getValue().get(i) * u.getValue().get(i);
        }
        return s;
    }

    public static Vector Subtract(Vector v, Vector u) {
        ArrayList<Double> vec = new ArrayList<>();
        for (int i = 0; i < v.getValue().size(); i++) {
            vec.add(v.getValue().get(i) - u.getValue().get(i));
        }
        return new Vector(vec);
    }



    public void setValue(ArrayList<Double> value) {
        this.value = value;
    }

    public void setValue() {
        this.value = new ArrayList<Double>();
    }

    @Override
    public String toString() {
        return value.stream().map(String::valueOf).collect(Collectors.joining(" ", "(", ")"));
    }
}
