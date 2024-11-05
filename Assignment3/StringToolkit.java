import java.util.Scanner; //Part 2: String Manipulation Toolkit

public class StringToolkit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int choice;

        do {
            System.out.println("1. Reverse String");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Check Palindrome");
            System.out.println("5. Count Vowels and Consonants");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    System.out.println("Reversed: " + new StringBuilder(input).reverse());
                    break;
                case 2:
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    System.out.println("Uppercase: " + input.toUpperCase());
                    break;
                case 3:
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    System.out.println("Lowercase: " + input.toLowerCase());
                    break;
                case 4:
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    System.out.println("Is palindrome: " + input.equalsIgnoreCase(new StringBuilder(input).reverse().toString()));
                    break;
                case 5:
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    countVowelsAndConsonants(input);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 0);
        scanner.close();
    }

    private static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("AEIOUaeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.printf("Vowels: %d, Consonants: %d%n", vowels, consonants);
    }
}
