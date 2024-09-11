public class Strings {

    // Method to calculate the length of a string
    public static int getStringLength(String s) {
        return s.length();
    }

    // Method to extract a substring from a string
    public static String getSubstring(String s, int start, int end) {
        return s.substring(start, end);
    }

    // Method to concatenate two strings
    public static String concatenateStrings(String s1, String s2) {
        return s1.concat(s2);
    }

    // Method to find the character at a specific index in a string
    public static char getCharAtIndex(String s, int index) {
        return s.charAt(index);
    }

    public static void main(String[] args) {
        // Example usage
        String s1 = "Hello";

        // Task 1: Calculate the length of the string
        int length = getStringLength(s1);
        System.out.println("Length of the string: " + length);

        // Task 2: Extract a substring from the string
        String substring = getSubstring(s1, 1, 4); // Extracting substring from index 1 to 3
        System.out.println("Substring: " + substring);

        // Task 3: Concatenate with another string
        String s2 = " World";
        String concatenatedString = concatenateStrings(s1, s2);
        System.out.println("Concatenated string: " + concatenatedString);

        // Task 4: Find the character at a specific index
        char charAtIndex = getCharAtIndex(s1, 1); // Finding the character at index 1
        System.out.println("Character at index 1: " + charAtIndex);
    }
}
