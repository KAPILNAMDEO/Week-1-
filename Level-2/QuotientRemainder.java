/*Write a program to take 2 numbers and print their quotient and reminder
Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___*/
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the first number (number1): ");
        int number1 = scanner.nextInt();
        
       
        System.out.print("Enter the second number (number2): ");
        int number2 = scanner.nextInt();
        
        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        
        // Display the results
        System.out.println("The Quotient is " + quotient + " and the Remainder is " + remainder 
                           + " of two numbers " + number1 + " and " + number2);
    }
}
