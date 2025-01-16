import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string
        String reversedString = reverseString(input);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

        // Close the scanner
        scanner.close();
    }

    // Method to reverse a string
    private static String reverseString(String str) {
        char[] charArray = str.toCharArray(); // Convert the string to a character array
        String reversed = ""; // Initialize an empty string to hold the reversed string

        // Iterate through the character array in reverse order
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed += charArray[i]; // Append each character to the reversed string
        }

        return reversed; // Return the reversed string
    }
}