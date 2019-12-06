package main;

public abstract class MatrixOperation {

    protected int[][] newMatrix;
    protected int n;

    public MatrixOperation(int n){
        this.n = n;
    }

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public abstract void performOperation(int[][] matrix1, int[][] matrix2);
}
