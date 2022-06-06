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

    // Subtraction
    public static ArrayList<ArrayList<Double>> Subtraction(Matrix first_value, Matrix second_value) {
        int first_dim = first_value.getValue().size();
        int second_dim = first_value.getValue().get(0).size();

        Matrix newMatrix = new Matrix();

        for (int i = 0; i < first_dim; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < second_dim; j++) {
                row.add(first_value.getValue().get(i).get(j) - second_value.getValue().get(i).get(j));
            }
            newMatrix.add(row);
        }

        return newMatrix.getValue();
    }

    static void getCofactor(Matrix mat, Matrix temp,
                            int p, int q, int n)
    {
        int i = 0, j = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row != p && col != q) {
                    temp.getValue().get(i).set(j++, mat.getValue().get(row).get(col));
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    static double determinantOfMatrix(Matrix first_value, int n) {
        int first_dim = first_value.getValue().size();
        int D = 0;

        if (n == 1)
            return first_value.getValue().get(0).get(0);

        Matrix temp = new Matrix();

        for (int i = 0; i < first_dim; i++) {
            ArrayList<Double> row = new ArrayList<>(Collections.nCopies(first_dim, 0.0));
            temp.add(row);
        }

        int sign = 1;

        for (int f = 0; f < n; f++) {
            getCofactor(first_value, temp, 0, f, n);
            D += sign * first_value.getValue().get(0).get(f) * determinantOfMatrix(temp, n - 1);

            sign = -sign;
        }
        return D;
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

    static double multiplyMatricesCell(Matrix A, Matrix B, int row, int col) {
        double cell = 0;
        for (int i = 0; i < B.getValue().size(); i++) {
            cell += A.getValue().get(row).get(i) * B.getValue().get(i).get(col);
        }
        return cell;
    }

    public static double[][] MatrixMultiplication(Matrix A, Matrix B) {
        int first_dim_A = A.getValue().size();
        int second_dim_A = A.getValue().get(0).size();

        int first_dim_B = B.getValue().size();
        int second_dim_B = B.getValue().get(0).size();

        double[][] result = new double[first_dim_A][second_dim_B];

        if (second_dim_A != first_dim_B) {
            System.out.println("ERROR");
        } else {
            for (int i = 0; i < first_dim_A; i++) {
                for (int j = 0; j < second_dim_B; j++) {
                    result[i][j] = multiplyMatricesCell(A, B, i, j);
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return  value.toString();
    }

}
