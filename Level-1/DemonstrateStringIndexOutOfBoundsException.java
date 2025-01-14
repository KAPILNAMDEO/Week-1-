/*Write a program to demonstrate StringIndexOutOfBoundsException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. This will
 generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of
 the String.
Then write try catch block for Exception while accessing the String method
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/
import java.util.Scanner;

public class DemonstrateStringIndexOutOfBoundsException {
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String str) {
        System.out.println("Attempting to access character at index beyond the length of the string...");
        System.out.println("Character: " + str.charAt(str.length())); //This will throw the exception
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String str) {
        try {
            System.out.println("Attempting to access character at index beyond the length of the string...");
            System.out.println("Character: " + str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("The index is out of bounds. Please ensure the index is within the valid range.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call method to generate the exception
        try {
            generateException(inputString);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception in generateException method: " + e.getMessage());
        }

        System.out.println("\nHandling the exception properly now...");

        // Call method to handle the exception
        handleException(inputString);

        scanner.close();
    }
}
