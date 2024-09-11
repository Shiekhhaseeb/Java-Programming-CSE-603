public class Arrays {

    // Method to compute the sum of an array
    public static int computeSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    // Method to print the array (for demonstration purposes)
    public static void printArray(int[] numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        numbers[4] = 6;

        printArray(numbers);

        int sum = computeSum(numbers);
        System.out.println("The sum of the array is: " + sum);
    }
}
