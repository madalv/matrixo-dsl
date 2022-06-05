package uwu;

import jdk.internal.net.http.common.Log;

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

//    public static ArrayList<Double> GaussElimination (Matrix first_value) {
//        int first_dim = first_value.getValue().size();
//        int second_dim = first_value.getValue().get(0).size();
//
//        Matrix newMatrix = new Matrix();
//        ArrayList<ArrayList<Double>> newList = new ArrayList<>(first_value.getValue());
//
//        for (int i = 0; i < first_dim; i++) {
//            for (int j = 0; j < first_dim; j++) {
//                if (i != j) {
//                    double b = newList.get(j).get(i) / newList.get(i).get(i);
//                    for (int k = 0; k < first_dim + 1; k++) {
//                        newList.get(j).set(k, newList.get(j).get(k) - b * newList.get(i).get(k));
//                    }
//                }
//            }
//        }
//
//
//        ArrayList<Double> row = new ArrayList<>();
//
//        for (int i = 0; i < first_dim; i++) {
//            row.add(newList.get(i).get(second_dim + 1) / newList.get(i).get(i));
//        }
//
//        return row;
//    }

    public ArrayList<Double> Eigenvalues(Matrix first_value) {
        int first_dim = first_value.getValue().size();
        int second_dim = first_value.getValue().get(0).size();

        ArrayList<Double> eigenvalues = new ArrayList<>();

        if (first_dim == 2) {
            double b = -1 * (first_value.getValue().get(0).get(0) + first_value.getValue().get(1).get(1));
            double c = first_value.getValue().get(0).get(0) * first_value.getValue().get(1).get(1) - first_value.getValue().get(1).get(0) * first_value.getValue().get(0).get(1);
            eigenvalues.addAll(Operations.quadraticSolver(1, b, c));
        } else if (getNumRows() == 3) {
            long trace = (long) Operations.trace(this);
            long determinant = (long) determinant(matrix, (int) getNumRows());
            long squaresTrace = (long) Operations.trace(squareTheMatrix());


            //now use the characteristic polynomial to solve for the eigenvalues
        }
        return eigenvalues;
    }

    @Override
    public String toString() {
        return  value.toString();
    }

}
