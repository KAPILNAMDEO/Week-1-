import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Prompt the user for the character to remove
        System.out.print("Character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        // Remove the specified character from the string
        String modifiedString = removeCharacter(inputString, charToRemove);

        // Display the result
        System.out.println("Modified String: \"" + modifiedString + "\"");

        // Close the scanner
        scanner.close();
    }

    // Method to remove all occurrences of a specific character from a string
    private static String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder(); // To store the modified string

        // Iterate through each character in the string
        for (char currentChar : str.toCharArray()) {
            // If the current character is not the one to remove, append it to the result
            if (currentChar != ch) {
                result.append(currentChar);
            }
        }

        return result.toString(); // Convert StringBuilder to String and return
    }
}