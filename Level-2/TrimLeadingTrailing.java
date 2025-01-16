import java.util.Scanner;

public class TrimLeadingTrailing {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] trimSpaces(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Find the first non-space character
        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character
        while (end > start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a line of text with leading and trailing spaces: ");
        String inputText = scanner.nextLine();

        // Trim spaces using custom method
        int[] trimIndices = trimSpaces(inputText);
        String trimmedText = createSubstring(inputText, trimIndices[0], trimIndices[1]);

        // Trim spaces using built-in trim() method
        String builtInTrimmedText = inputText.trim();

        // Compare the results
        boolean areEqual = compareStrings(trimmedText, builtInTrimmedText);

        // Display the results
        System.out.println("Text after custom trim: [" + trimmedText + "]");
        System.out.println("Text after built-in trim: [" + builtInTrimmedText + "]");
        System.out.println("Are both trimmed texts equal? " + areEqual);

        scanner.close();
    }
}
