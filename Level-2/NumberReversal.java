/*Create a program to take a number as input and reverse the number. To do this, store the digits of 
the number in an array and display the array in reverse order
Hint => 
Take user input for a number. 
Find the count of digits in the number. 
Find the digits in the number and save them in an array
Create an array to store the elements of the digits array in reverse order
Finally, display the elements of the array in reverse order
*/
import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        // Take user input for a number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Handle the case for negative numbers
        boolean isNegative = number < 0;
        if (isNegative) {
            number = -number; // Make the number positive for processing
        }

        // Find the count of digits in the number
        int digitCount = 0;
        int tempNumber = number;
        while (tempNumber > 0) {
            tempNumber /= 10;
            digitCount++;
        }

        // Store the digits of the number in an array
        int[] digits = new int[digitCount];
        tempNumber = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }

        // Display the digits in reverse order
        System.out.print("The reversed number is: ");
        if (isNegative) {
            System.out.print("-"); // Add the negative sign for negative numbers
        }
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }

        scanner.close();
    }
}


