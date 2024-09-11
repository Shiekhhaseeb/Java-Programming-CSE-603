public class MatrixOperations {

    // Method to access a specific element in the matrix
    public static int getElement(int[][] matrix, int row, int col) {
        return matrix[row][col];
    }

    // Method to add two matrices and return the result
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Task 1: Access and print a specific element
        int element = getElement(matrix, 1, 1); // Accessing element at row 1, column 1
        System.out.println("Element at row 1, column 1: " + element);

        // Another matrix for matrix addition
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Task 2: Perform matrix addition and print the result
        int[][] resultMatrix = addMatrices(matrix, matrix2);

        System.out.println("Matrix addition result:");
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
