import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Prompt the user for the substring
        System.out.print("Enter the substring to search for: ");
        String substring = scanner.nextLine();

        // Count occurrences of the substring in the main string
        int count = countSubstringOccurrences(mainString, substring);

        // Display the result
        System.out.println("The substring \"" + substring + "\" occurs " + count + " times in the main string.");

        // Close the scanner
        scanner.close();
    }

    // Method to count occurrences of a substring in a string
    private static int countSubstringOccurrences(String mainString, String substring) {
        int count = 0; // Initialize count
        int index = 0; // Start index for searching

        // Loop to find all occurrences of the substring
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++; // Increment count
            index += substring.length(); // Move index forward to avoid counting the same occurrence
        }

        return count; // Return the total count
    }
}