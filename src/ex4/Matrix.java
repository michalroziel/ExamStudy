package ex4;
public class Matrix<T extends Number> {
    private T[][] matrix;

    public Matrix(int m, int n) {
        matrix = (T[][]) new Number[m][n];
    }

    public T get(int i, int j) {
        return matrix[i][j];
    }

    public void set(int i, int j, T value) {
        matrix[i][j] = value;
    }

    public Matrix<Double> add(Matrix<? extends Number> other) {
        int m = matrix.length;
        int n = matrix[0].length;
        Matrix<Double> result = new Matrix<>(m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Double sum = matrix[i][j].doubleValue() + other.get(i, j).doubleValue();
                result.set(i, j, sum);
            }
        }
        return result;
    }
    public Matrix<T> skal(T skalar) {
        int m = matrix.length;
        int n = matrix[0].length;
        Matrix<T> result = new Matrix<>(m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Number sum = matrix[i][j].doubleValue() * skalar.doubleValue();
                result.set(i, j, (T) sum);
            }
        }
        return result;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T[] row : matrix) {
            for (T value : row) {
                sb.append(value).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
