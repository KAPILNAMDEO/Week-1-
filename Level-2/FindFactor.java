/*Create a program to find the factors of a number taken as user input, store the factors in an array and 
display the factors. Also find the sum, sum of square of factors and product of the factors and display the results
Hint => 
Take the input for a number
Write a static Method to find the factors of the number and save them in an array and return the array. 
To find factors and save to array will have two loops. The first loop to find the count and initialize the 
array with the count. And the second loop save the factors into the array
Write a method to find the sum of the factors using factors array
Write a method to find the product of the factors using factors array
Write a method to find the sum of square of the factors using Math.pow() method
*/
import java.util.Scanner;

public class FindFactor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the factors of the number
        int[] factors = findFactors(number);

        // Display the factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            if (factor != 0) {  // To avoid printing 0 (default value for unused array spots)
                System.out.print(factor + " ");
            }
        }
        System.out.println();

        // Calculate and display the sum of factors
        int sum = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sum);

        // Calculate and display the sum of the squares of the factors
        double sumOfSquares = sumOfSquaresOfFactors(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

        // Calculate and display the product of the factors
        int product = productOfFactors(factors);
        System.out.println("Product of factors: " + product);

        scanner.close();
    }

    // Method to find factors of a number and return them in an array
    public static int[] findFactors(int number) {
        int count = 0;
        // First loop to find count of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize the array with the count of factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the sum of the squares of the factors
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    // Method to find the product of the factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
}
