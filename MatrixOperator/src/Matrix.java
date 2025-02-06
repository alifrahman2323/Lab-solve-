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

public class MatrixSum {
    // Method to read a matrix from a file
    public static Matrix readMatrixFromFile(String filename) throws IOException {
        List<int[]> matrixList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.trim().split("\\s+");
                int[] row = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();
                matrixList.add(row);
            }
        }

        int[][] matrix = matrixList.toArray(new int[0][]);
        return new Matrix(matrix);
    }

    public static void main(String[] args) {
        try {
            // Reading matrices from files
            Matrix matrix1 = readMatrixFromFile("matrix1.txt");
            Matrix matrix2 = readMatrixFromFile("matrix2.txt");

            // Adding matrices
            Matrix resultMatrix = Matrix.addMatrices(matrix1, matrix2);

            // Printing the result
            System.out.println("Sum of the matrices:");
            resultMatrix.printMatrix();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
