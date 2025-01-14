/*Write a program to demonstrate NumberFormatException
Hint => 
Define a variable to take user input as a String 
Use Integer.parseInt() to generate this exception. Integer.parseInt() is a built-in function in java.lang.Integer class to extract the number from text. In case the text does not contain numbers the method will throw NumberFormatException which is a runtime exception
Write a Method to generate the Exception. Use Integer.parseInt(text) to extract number from the text. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate NumberFormatException. Use Integer.parseInt(text) to extract number from the text. This will generate a runtime exception. Use the try-catch block to handle the NumberFormatException as well as the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/
import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        System.out.println("Attempting to parse text to integer...");
        int number = Integer.parseInt(text); // This will throw the exception if text is not a valid number
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            System.out.println("Attempting to parse text to integer...");
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
            System.out.println("Please enter a valid numeric value.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text to parse as an integer: ");
        String inputText = scanner.nextLine();

        // Call method to generate the exception
        try {
            generateException(inputText);
        } catch (NumberFormatException e) {
            System.out.println("Exception in generateException method: " + e.getMessage());
        }

        System.out.println("\nHandling the exception properly now...");

        // Call method to handle the exception
        handleException(inputText);

        scanner.close();
    }
}
