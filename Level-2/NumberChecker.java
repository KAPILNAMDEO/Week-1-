import java.util.Scanner;

public class NumberChecker {

    // Method to check whether the number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check whether the number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Take input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Check each number for positivity and even/odd
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.print("Number " + numbers[i] + " is positive and ");
                if (isEven(numbers[i])) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println("Number " + numbers[i] + " is negative.");
            }
        }

        // Compare the first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult > 0) {
            System.out.println("The first element is greater than the last element.");
        } else if (comparisonResult == 0) {
            System.out.println("The first element is equal to the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        scanner.close();
    }
}
