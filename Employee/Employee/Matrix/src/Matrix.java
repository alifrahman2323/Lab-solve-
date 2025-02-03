import java.io.*;
import java.util.*;

class Matrix {
    private int[][] matrix;

    // Constructor to initialize the matrix
    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    // Method to get the matrix
    public int[][] getMatrix() {
        return matrix;
    }

    // Static method to add two matrices
    public static Matrix addMatrices(Matrix m1, Matrix m2) throws IllegalArgumentException {
        int[][] mat1 = m1.getMatrix();
        int[][] mat2 = m2.getMatrix();

        if (mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
            throw new IllegalArgumentException("Matrices dimensions do not match for addition.");
        }

        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        return new Matrix(result);
    }

    // Method to print the matrix
    public void printMatrix() {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
