package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of rows/columns");
        int n = Integer.parseInt(reader.readLine());

        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        //random init as transpose so i can use print method
        MatrixOperation matrixOperation = new MatrixOperationTranspose(n);

        //MATRIX A INPUT
        System.out.println("Enter matrix A: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("Enter ["+i+"]"+"["+j+"] element: ");
                matrix1[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        System.out.println("Matrix A: ");
        matrixOperation.printMatrix(matrix1);

        //MATRIX B INPUT
        System.out.println("Enter matrix B: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("Enter ["+i+"]"+"["+j+"] element: ");
                matrix2[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        System.out.println("Matrix B: ");
        matrixOperation.printMatrix(matrix2);

        //TRANSPOSITION
        matrixOperation = new MatrixOperationTranspose(n);
        System.out.println("*************TRANSPOSITION*************");

        System.out.println("Matrix A: ");
        matrixOperation.printMatrix(matrix1);
        System.out.println("Matrix B: ");
        matrixOperation.printMatrix(matrix2);
        matrixOperation.performOperation(matrix1, matrix2);

        //SUM
        System.out.println("*************SUM*************");
        matrixOperation = new MatrixOperationSum(n);
        System.out.println("Matrix A: ");
        matrixOperation.printMatrix(matrix1);
        System.out.println(" + \nMatrix B: ");
        matrixOperation.printMatrix(matrix2);
        System.out.println(" = ");
        matrixOperation.performOperation(matrix1, matrix2);

        //MULTIPLICATION
        System.out.println("*************MULTIPLICATION*************");
        matrixOperation = new MatrixOperationMultiply(n);
        System.out.println("Matrix A: ");
        matrixOperation.printMatrix(matrix1);
        System.out.println(" * ");
        System.out.println("Matrix B: ");
        matrixOperation.printMatrix(matrix2);
        System.out.println(" = ");
        matrixOperation.performOperation(matrix1, matrix2);
    }
}
