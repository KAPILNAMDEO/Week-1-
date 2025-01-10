import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Store the original number for later comparison
        int originalNumber = number;

        // Variable to store the sum of digits
        int sum = 0;

        // Use a while loop to access each digit of the number
        while (number != 0) {
            
            int digit = number % 10;

            // Add the digit to the sum
            sum += digit;

            // Remove the last digit from the number
            number /= 10;
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        // Close the scanner
        scanner.close();
    }
}
