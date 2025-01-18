import java.util.Scanner;

public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking the number of terms as input
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int terms = scanner.nextInt();
        
        // Generating and printing the Fibonacci sequence
        printFibonacciSequence(terms);
        
        scanner.close();
    }

    // Function to generate and print the Fibonacci sequence up to 'n' terms
    public static void printFibonacciSequence(int n) {
        // Handling the first two terms separately
        int a = 0, b = 1;
        
        System.out.print("Fibonacci Sequence: ");
        
        // Loop through to generate the sequence up to 'n' terms
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;  // Update a to the next term
            b = nextTerm;  // Update b to the next term
        }
        
        System.out.println(); // Print a new line after the sequence
    }
}
