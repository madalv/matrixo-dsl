package uwu;

import java.util.ArrayList;
import java.util.Collections;

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

    // Addition
    public static ArrayList<ArrayList<Double>> Addition(Matrix first_value, Matrix second_value) {
        int first_dim = first_value.getValue().size();
        int second_dim = first_value.getValue().get(0).size();

        Matrix newMatrix = new Matrix();

        for (int i = 0; i < first_dim; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < second_dim; j++) {
                row.add(first_value.getValue().get(i).get(j) + second_value.getValue().get(i).get(j));
            }
            newMatrix.add(row);
        }

        return newMatrix.getValue();
    }

    // Multiplication
    public static ArrayList<ArrayList<Double>> Multiplication(Matrix first_value, double scalar) {
        int first_dim = first_value.getValue().size();
        int second_dim = first_value.getValue().get(0).size();

        Matrix newMatrix = new Matrix();

        for (int i = 0; i < first_dim; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < second_dim; j++) {
                row.add(first_value.getValue().get(i).get(j) * scalar);
            }
            newMatrix.add(row);
        }

        return newMatrix.getValue();
    }

    // Vector multiplication
    public static ArrayList<Double> VectorMultiplication(Matrix first_value, ArrayList<Double> vector) {
        int first_dim = first_value.getValue().size();
        int second_dim = first_value.getValue().get(0).size();

        ArrayList<Double> row = new ArrayList<>(Collections.nCopies(first_dim, 0.0));

        for (int i = 0; i < first_dim; i++) {
            for (int j = 0; j < second_dim; j++) {
                row.set(i, row.get(i) + (vector.get(i) * first_value.getValue().get(i).get(j)));
            }
        }
        return row;
    }

    public static ArrayList<ArrayList<Double>> Transpose(Matrix first_value) {
        int first_dim = first_value.getValue().size();
        int second_dim = first_value.getValue().get(0).size();

        Matrix newMatrix = new Matrix();

        for (int i = 0; i < first_dim; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < second_dim; j++) {
                row.add(first_value.getValue().get(j).get(i));
            }
            newMatrix.add(row);
        }

        return newMatrix.getValue();
    }

    public static double[] GaussElimination(Matrix A, ArrayList<Double> B) {
        int N = B.size();

        for (int k = 0; k < N; k++) {
            int max = k;
            for (int i = k + 1; i < N; i++)
                if (Math.abs(A.getValue().get(i).get(k)) > Math.abs(A.getValue().get(max).get(k)))
                    max = i;

            ArrayList<Double> temp = A.getValue().get(k);
            A.getValue().set(k, A.getValue().get(max));
            A.getValue().set(max, temp);

            double t = B.get(k);
            B.set(k, B.get(max));
            B.set(max, t);

            for (int i = k + 1; i < N; i++) {
                double factor = A.getValue().get(i).get(k) / A.getValue().get(k).get(k);
                B.set(i, B.get(i) - factor * B.get(k));
                for (int j = k; j < N; j++)
                    A.getValue().get(i).set(j, A.getValue().get(i).get(j) - factor * A.getValue().get(k).get(j));
            }
        }

        double[] solution = new double[N];
        for (int i = N - 1; i >= 0; i--) {
            double sum = 0.0;
            for (int j = i + 1; j < N; j++)
                sum += A.getValue().get(i).get(j) * solution[j];
            solution[i] = (B.get(i) - sum) / A.getValue().get(i).get(i);
        }

        return solution;
    }

    @Override
    public String toString() {
        return  value.toString();
    }

}
