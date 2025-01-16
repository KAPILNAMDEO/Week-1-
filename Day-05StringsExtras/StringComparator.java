import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first string
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        // Prompt the user for the second string
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        // Compare the two strings
        int comparisonResult = compareStrings(string1, string2);

        // Display the result
        if (comparisonResult < 0) {
            System.out.println("\"" + string1 + "\" is less than \"" + string2 + "\".");
        } else if (comparisonResult > 0) {
            System.out.println("\"" + string1 + "\" is greater than \"" + string2 + "\".");
        } else {
            System.out.println("\"" + string1 + "\" is equal to \"" + string2 + "\".");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to compare two strings lexicographically
    private static int compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        // Compare characters one by one
        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            // Compare the characters
            if (char1 != char2) {
                return char1 - char2; // Return the difference
            }
        }

        // If all characters are the same up to the length of the shorter string
        return str1.length() - str2.length(); // Compare lengths
    }
}