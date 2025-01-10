/*Create a program to count the number of digits in an integer.
Hint => 
Get an integer input for the number variable.
Create an integer variable count with value 0.
Use a loop to iterate until number is not equal to 0.
Remove the last digit from number in each iteration
Increase count by 1 in each iteration.
Finally display the count to show the number of digits*/

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Handle negative numbers by taking absolute value
        number = Math.abs(number);

        // Create a variable to count the digits
        int count = 0;

        // Use a loop to iterate until the number is not equal to 0
        while (number != 0) {
            // Remove the last digit from the number
            number /= 10;

            // Increment the count
            count++;
        }

        // Special case for 0, which has 1 digit
        if (count == 0) {
            count = 1; // The number 0 has 1 digit
        }

        // Display the count to show the number of digits
        System.out.println("The number of digits is: " + count);

        // Close the scanner
        scanner.close();
    }
}
