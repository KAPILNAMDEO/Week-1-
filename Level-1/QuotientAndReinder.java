/*Write a program to take 2 numbers and print their quotient and reminder
Hint => 
Take user input as integer
Use division operator (/) for quotient and moduli operator (%) for reminder
Write Method to find the reminder and the quotient of a number 
public static int[] findRemainderAndQuotient(int number, int divisor) 
*/
import java.util.Scanner;

public class QuotientAndReinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number and divisor
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        if (divisor != 0) {
            // Call the method to find remainder and quotient
            int[] result = findRemainderAndQuotient(number, divisor);

            // Display the results
            System.out.println("Quotient: " + result[1]);
            System.out.println("Remainder: " + result[0]);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        scanner.close();
    }

    // Method to find the remainder and quotient of a number
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[] {remainder, quotient};
    }
}
