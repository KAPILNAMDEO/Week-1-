/*Create a program to check if a number is Armstrong or not. Use the hints to show the steps clearly in the code
Hint => 
Armstrong Number is a number whose Sum of cubes of each digit results in the original number e.g. 153 = 1^3 + 5^3 + 3^3
Get an integer input and store it in the number variable define sum variable, initialize it to zero and originalNumber variable, and assign it to the input number variable
Use the while loop till the originalNumber is not equal to zero
In the while loop find the reminder number by using the modulus operator as in  number % 10. Find the cube of the number and add it to the sum variable
Again in while loop find the quotient of the number and assign it to the original number using number / 10 expression. This romoves the last digit of the original number.
Finally check if the number and the sum are the same, if same its an Armstrong number else not. So display accordingly*/


import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Store the original number to compare later
        int originalNumber = number;

        // Variable to hold the sum of cubes of digits
        int sum = 0;

        // Use a while loop to process each digit of the number
        while (number != 0) {
            // Find the last digit of the number using modulus operator
            int digit = number % 10;

            // Find the cube of the digit and add it to sum
            sum += digit * digit * digit;

            // Remove the last digit from the number by dividing by 10
            number /= 10;
        }

        // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        // Close the scanner
        scanner.close();
    }
}
