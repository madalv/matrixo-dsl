package matrixoLang;


import java.util.ArrayList;

public class Matrix{
    private ArrayList<ArrayList<Double>> value;

    public Matrix() {
        value = new ArrayList<>();
    }

    public Matrix(ArrayList<ArrayList<Double>> a) {
        value = a;
    }

    public void add(ArrayList<Double> a) {
        value.add(a);
    }

    public ArrayList<ArrayList<Double>> getValue() {
        return value;
    }

    public void setValue(ArrayList<ArrayList<Double>> value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  value.toString();
    }

    //    public Double getDeterminant(Matrix<T> m) {
//        //TODO: ERROR HANDLING -- uneven matrix / boolean generic
//    }
}
