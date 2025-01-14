import java.util.Scanner;

public class TextToUppercaseComparison {

    // Method to convert text to uppercase without using built-in toUpperCase()
    public static String convertToUpperCase(String text) {
        StringBuilder uppercaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // Convert to uppercase
            }
            uppercaseText.append(ch);
        }
        return uppercaseText.toString();
    }

    // Method to compare two strings character by character
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        // Convert text to uppercase using built-in method
        String builtInUpperCase = inputText.toUpperCase();

        // Convert text to uppercase using custom method
        String customUpperCase = convertToUpperCase(inputText);

        // Compare the results
        boolean areEqual = compareStrings(builtInUpperCase, customUpperCase);

        // Display the results
        System.out.println("\nOriginal Text: " + inputText);
        System.out.println("Uppercase (built-in method): " + builtInUpperCase);
        System.out.println("Uppercase (custom method): " + customUpperCase);
        System.out.println("Are both uppercase conversions identical? " + areEqual);

        scanner.close();
    }
}
