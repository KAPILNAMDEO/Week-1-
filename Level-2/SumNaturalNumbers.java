/*Write a program to find the sum of n natural numbers using recursive method and compare the result
 with the formulae n*(n+1)/2 and show the result from both computations is correct. 
Hint => 
Take the user input number and check whether it's a Natural number, if not exit
Write a Method to find the sum of n natural numbers using recursion
Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
Compare the two results and print the result
*/
import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Check if the input is a natural number
        if (number <= 0) {
            System.err.println("Invalid input. Please enter a natural number.");
            System.exit(0);
        }

        // Calculate the sum using recursion
        int recursiveSum = findSumUsingRecursion(number);

        // Calculate the sum using the formula
        int formulaSum = findSumUsingFormula(number);

        // Compare the results
        System.out.println("Sum of " + number + " natural numbers using recursion: " + recursiveSum);
        System.out.println("Sum of " + number + " natural numbers using formula: " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both computations produce the same result.");
        } else {
            System.out.println("The computations produce different results.");
        }
    }

    // Method to find the sum of n natural numbers using recursion
    public static int findSumUsingRecursion(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number + findSumUsingRecursion(number - 1);
        }
    }

    // Method to find the sum of n natural numbers using the formula
    public static int findSumUsingFormula(int number) {
        return number * (number + 1) / 2;
    }
}

