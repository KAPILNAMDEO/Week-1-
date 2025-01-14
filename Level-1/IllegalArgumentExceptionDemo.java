import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String str) {
        System.out.println("Attempting to extract substring with start index greater than end index...");
        System.out.println("Substring: " + str.substring(5, 2)); // This will throw the exception
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String str) {
        try {
            System.out.println("Attempting to extract substring with start index greater than end index...");
            System.out.println("Substring: " + str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
            System.out.println("Ensure the start index is less than or equal to the end index.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call method to generate the exception
        try {
            generateException(inputString);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception in generateException method: " + e.getMessage());
        }

        System.out.println("\nHandling the exception properly now...");

        // Call method to handle the exception
        handleException(inputString);

        scanner.close();
    }
}
