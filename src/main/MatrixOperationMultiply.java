package main;

public class MatrixOperationMultiply  extends MatrixOperation{
    public MatrixOperationMultiply(int n) {
        super(n);
    }

    @Override
    public void performOperation(int[][] matrix1, int[][] matrix2) {
        int j, k, i;
        int sum;
        newMatrix = new int[n][n];

        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++) {
                sum = 0;
                for (k = 0; k < n; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                newMatrix[i][j] = sum;
            }
        printMatrix(newMatrix);
    }
}
