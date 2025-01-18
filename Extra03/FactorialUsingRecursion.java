import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        int number = getInput(scanner);
        
        // Calculating the factorial using recursion
        long factorial = calculateFactorial(number);
        
        // Displaying the result
        displayResult(number, factorial);
        
        scanner.close();
    }

    // Function to take input from the user
    public static int getInput(Scanner scanner) {
        System.out.print("Enter a number to calculate its factorial: ");
        return scanner.nextInt();
    }

    // Function to calculate the factorial using recursion
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) { // Base case
            return 1;
        } else {
            return n * calculateFactorial(n - 1); // Recursive case
        }
    }

    // Function to display the result
    public static void displayResult(int num, long result) {
        System.out.println("The factorial of " + num + " is: " + result);
    }
}
