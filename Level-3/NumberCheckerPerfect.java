/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different
 methods and display results. Make sure all are static methods
Hint => 
Method to find factors of a number and return them as an array. Note there are 2 for loops one for the count and 
another for finding the factor and storing in the array
Method to find the greates factor of a Number using the factors array
Method to find the sum of the factors using factors array and return the sum
Method to find the product of the factors using factors array and return the product
Method to find product of cube of the factors using the factors array. Use Math.pow() 
Method to Check if a number is a perfect number. Perfect numbers are positive integers that are equal to the sum
 of their proper divisors
Method to find the number is a abundant number. A number is called an abundant number if the sum of its proper
 divisors is greater than the number itself
Method to find the number is a deficient number. A number is called a deficient number if the sum of its proper
 divisors is less than the number itself
Method to Check if a number is a strong number. A number is called a strong number if the sum of the factorial
 of its digits is equal to the number itself
*/
import java.util.Scanner;

public class NumberCheckerPerfect {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 1];
    }

    // Method to find the sum of the factors using the factors array
    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int productOfFactors(int number) {
        int[] factors = findFactors(number);
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors using the factors array
    public static double productOfCubesOfFactors(int number) {
        int[] factors = findFactors(number);
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = sumOfFactors(number) - number; // Exclude the number itself
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int sum = sumOfFactors(number) - number; // Exclude the number itself
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int sum = sumOfFactors(number) - number; // Exclude the number itself
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sumOfFactorials = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sumOfFactorials += factorial(digit);
            temp /= 10;
        }
        return sumOfFactorials == number;
    }

    // Helper method to calculate the factorial of a number
    public static int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method to test the utility class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find and display the factors
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ":");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Greatest factor
        System.out.println("Greatest factor of " + number + ": " + greatestFactor(number));

        // Sum of factors
        System.out.println("Sum of factors of " + number + ": " + sumOfFactors(number));

        // Product of factors
        System.out.println("Product of factors of " + number + ": " + productOfFactors(number));

        // Product of cubes of factors
        System.out.println("Product of cubes of factors of " + number + ": " + productOfCubesOfFactors(number));

        // Perfect number check
        System.out.println(number + " is a perfect number: " + isPerfectNumber(number));

        // Abundant number check
        System.out.println(number + " is an abundant number: " + isAbundantNumber(number));

        // Deficient number check
        System.out.println(number + " is a deficient number: " + isDeficientNumber(number));

        // Strong number check
        System.out.println(number + " is a strong number: " + isStrongNumber(number));
    }
}

