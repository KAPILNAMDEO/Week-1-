import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove duplicates from the string
        String result = removeDuplicates(input);

        // Display the result
        System.out.println("String after removing duplicates: " + result);

        // Close the scanner
        scanner.close();
    }

    // Method to remove duplicate characters from a string
    private static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder(); // To store the result
        boolean[] seen = new boolean[256]; // Array to track seen characters

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // Check if the character has not been seen before
            if (!seen[ch]) {
                seen[ch] = true; // Mark the character as seen
                result.append(ch); // Append the character to the result
            }
        }

        return result.toString(); // Convert StringBuilder to String and return
    }
}