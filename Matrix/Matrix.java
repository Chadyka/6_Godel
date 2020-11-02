package Matrix;


import java.util.Arrays;
import java.util.stream.IntStream;

final public class Matrix {
    private final int M;             // number of rows
    private final int N;             // number of columns
    private int[][] data;   // M-by-N array

    // create M-by-N matrix of 0's
    public Matrix(int M, int N) {
        this.M = M;
        this.N = N;
        data = new int[M][N];
    }

    // create and return a random M-by-N matrix with values between 0 and 10
    public static Matrix random(int M, int N) {
        Matrix A = new Matrix(M, N);
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                A.data[i][j] = (int) (Math.random() * (10+1));
        return A;
    }

    // does A = B exactly?
    public boolean eq(Matrix B) {
        Matrix A = this;
        if (B.M != A.M || B.N != A.N) throw new RuntimeException("Illegal matrix dimensions.");
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                if (A.data[i][j] != B.data[i][j]) return false;
        return true;
    }

    // return C = A * B
    public Matrix times(Matrix B) {
        if (this.N != B.M) throw new RuntimeException("Illegal matrix dimensions.");
        Matrix C = new Matrix(this.M, B.N);

        C.data = Arrays.stream(this.data).map(r -> IntStream.range(0, B.N).map(i -> IntStream.range(0, B.M).map(j -> r[j] * B.data[i][j]).sum()).toArray()).toArray(int[][]::new);

        return C;
    }

    // print matrix to standard output
    public void show() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++)
                System.out.printf("%d ", data[i][j]);
            System.out.println();
        }
    }


}
