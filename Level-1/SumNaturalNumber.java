/*Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop 
*/
import java.util.Scanner;

public class SumNaturalNumber{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a positive integer (number): ");
        int number = scanner.nextInt();

        if (number > 0) {
            // Call the method to find the sum and print the result
            int sum = findSum(number);
            System.out.println("The sum of the first " + number + " natural numbers is: " + sum);
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
        scanner.close();
    }

    // Method to find the sum of n natural numbers
    public static int findSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}
