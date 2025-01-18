import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Displaying menu of operations
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();
        
        // Taking two numbers as input
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Performing the selected operation
        switch (choice) {
            case 1:
                double sum = add(num1, num2);
                System.out.println("Result: " + sum);
                break;
            case 2:
                double difference = subtract(num1, num2);
                System.out.println("Result: " + difference);
                break;
            case 3:
                double product = multiply(num1, num2);
                System.out.println("Result: " + product);
                break;
            case 4:
                if (num2 != 0) {
                    double quotient = divide(num1, num2);
                    System.out.println("Result: " + quotient);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice! Please select 1, 2, 3, or 4.");
        }
        
        scanner.close();
    }

    // Function for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Function for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function for division
    public static double divide(double a, double b) {
        return a / b;
    }
}
