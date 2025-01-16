import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Toggle the case of the characters in the string
        String toggledString = toggleCase(input);

        // Display the result
        System.out.println("String after toggling case: " + toggledString);

        // Close the scanner
        scanner.close();
    }

    // Method to toggle the case of each character in a string
    private static String toggleCase(String str) {
        StringBuilder result = new StringBuilder(); // To store the result

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // Check if the character is uppercase
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch)); // Convert to lowercase
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch)); // Convert to uppercase
            } else {
                result.append(ch); // Keep non-alphabetic characters unchanged
            }
        }

        return result.toString(); // Convert StringBuilder to String and return
    }
}