package main;

public class MatrixOperationTranspose extends MatrixOperation {

    public MatrixOperationTranspose(int n) {
        super(n);
    }

    @Override
    public void performOperation(int[][] matrix1, int[][] matrix2) {
        newMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[i][j] = matrix1[j][i];
            }
        }
        System.out.println("Transposed matrix1: ");
        printMatrix(newMatrix);
        newMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[i][j] = matrix2[j][i];
            }
        }
        System.out.println("Transposed matrix2: ");
        printMatrix(newMatrix);
    }
}
