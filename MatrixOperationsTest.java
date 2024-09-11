import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class MatrixOperationsTest {

    @Test
    public void testGetElement() {
        // Test case: Access a specific element in the matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Test element at row 1, column 1
        int element = MatrixOperations.getElement(matrix, 1, 1);
        assertEquals(5, element);
  
        // Test element at row 0, column 2
        element = MatrixOperations.getElement(matrix, 0, 2);
        assertEquals(3, element);
    }

    @Test
    public void testAddMatrices() {
        // Test case: Add two matrices
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        int[][] expectedMatrix = {
            {10, 10, 10},
            {10, 10, 10},
            {10, 10, 10}
        };
        
        int[][] resultMatrix = MatrixOperations.addMatrices(matrix1, matrix2);
        assertArrayEquals(expectedMatrix, resultMatrix);
        System.out.println("Testpassed");
    }
}
