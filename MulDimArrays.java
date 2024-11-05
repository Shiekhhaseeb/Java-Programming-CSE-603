import java.util.Arrays;

public class MulDimArrays {
    public static void main(String[] args) {
     
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };

        int[][] matrix2 = {
            {5, 6},
            {7, 8}
        };

     
        System.out.println("Element at row 0, column 1 in matrix1: " + matrix1[0][1]);

        
        int[][] resultMatrix = new int[2][2]; 

      
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

       
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
