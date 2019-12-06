package main;

public class MatrixOperationSum extends MatrixOperation{

    public MatrixOperationSum(int n) {
        super(n);
    }

    @Override
    public void performOperation(int[][] matrix1, int[][] matrix2) {
        newMatrix = new int[n][n];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        printMatrix(newMatrix);
    }
}
