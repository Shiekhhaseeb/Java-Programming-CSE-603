    //  Part 6: Command-Line Calculator

 import java.util.Scanner;
 import java.util.Stack;
 
 public class CommandLineCalculator {
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String input;
 
         System.out.println("Welcome to the Command-Line Calculator!");
         System.out.println("Enter a mathematical expression to evaluate (or 'exit' to quit):");
 
         while (true) {
             System.out.print("> ");
             input = scanner.nextLine();
 
             if (input.equalsIgnoreCase("exit")) {
                 System.out.println("Exiting the calculator. Goodbye!");
                 break;
             }
 
             try {
                 double result = evaluateExpression(input);
                 System.out.println("Result: " + result);
             } catch (Exception e) {
                 System.out.println("Error: " + e.getMessage());
             }
         }
 
         scanner.close();
     }
 
     // Method to evaluate the expression
     private static double evaluateExpression(String expression) {
         // Remove whitespace
         expression = expression.replaceAll("\\s+", "");
 
         // Stack for numbers and operators
         Stack<Double> numbers = new Stack<>();
         Stack<Character> operators = new Stack<>();
 
         for (int i = 0; i < expression.length(); i++) {
             char ch = expression.charAt(i);
 
             // If the character is a number, parse the complete number
             if (Character.isDigit(ch) || ch == '.') {
                 StringBuilder number = new StringBuilder();
                 while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                     number.append(expression.charAt(i++));
                 }
                 numbers.push(Double.parseDouble(number.toString()));
                 i--; // Decrement i as the outer loop will increment it
             } 
             // If the character is an opening parenthesis
             else if (ch == '(') {
                 operators.push(ch);
             } 
             // If the character is a closing parenthesis
             else if (ch == ')') {
                 while (!operators.isEmpty() && operators.peek() != '(') {
                     numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
                 }
                 operators.pop(); // Pop the '('
             } 
             // If the character is an operator
             else if (isOperator(ch)) {
                 while (!operators.isEmpty() && precedence(ch) <= precedence(operators.peek())) {
                     numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
                 }
                 operators.push(ch);
             }
         }
 
         // Apply remaining operators
         while (!operators.isEmpty()) {
             numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
         }
 
         return numbers.pop(); // The result will be the last number in the stack
     }
 
     // Method to check if the character is an operator
     private static boolean isOperator(char ch) {
         return ch == '+' || ch == '-' || ch == '*' || ch == '/';
     }
 
     // Method to determine operator precedence
     private static int precedence(char operator) {
         switch (operator) {
             case '+':
             case '-':
                 return 1;
             case '*':
             case '/':
                 return 2;
             default:
                 return 0;
         }
     }
 
     // Method to apply the operator to two numbers
     private static double applyOperation(char operator, double b, double a) {
         switch (operator) {
             case '+': return a + b;
             case '-': return a - b;
             case '*': return a * b;
             case '/':
                 if (b == 0) throw new UnsupportedOperationException("Cannot divide by zero");
                 return a / b;
             default: return 0;
         }
     }
 }
 