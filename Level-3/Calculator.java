import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double second = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        String op = scanner.next();

        // Variable to store the result
        double result;

        // Use a switch...case to perform the correct operation
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":
                 // Handle division by zero
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                // If the operator is invalid, print an error message
                System.out.println("Invalid Operator.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}
