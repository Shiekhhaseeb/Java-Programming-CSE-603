import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
       
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Modified array: " + Arrays.toString(arr));

        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

       
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of all elements in the array: " + sum);
    }
}
