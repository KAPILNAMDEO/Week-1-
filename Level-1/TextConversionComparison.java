import java.util.Scanner;

public class TextConversionComparison {

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

    // Method to convert text to lowercase without using built-in toLowerCase()
    public static String convertToLowerCase(String text) {
        StringBuilder lowercaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // Convert to lowercase
            }
            lowercaseText.append(ch);
        }
        return lowercaseText.toString();
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

    // Method to split text into words and return a 2D array with words and their lengths
    public static String[][] splitTextIntoWords(String text) {
        String[] words = text.split(" ");
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        // Convert text to uppercase using built-in method
        String builtInUpperCase = inputText.toUpperCase();

        // Convert text to uppercase using custom method
        String customUpperCase = convertToUpperCase(inputText);

        // Compare the results for uppercase conversion
        boolean areUppercaseEqual = compareStrings(builtInUpperCase, customUpperCase);

        // Convert text to lowercase using custom method
        String customLowerCase = convertToLowerCase(inputText);

        // Convert text to lowercase using built-in method
        String builtInLowerCase = inputText.toLowerCase();

        // Compare the results for lowercase conversion
        boolean areLowercaseEqual = compareStrings(builtInLowerCase, customLowerCase);

        // Split text into words and their lengths
        String[][] wordsWithLengths = splitTextIntoWords(inputText);

        // Display the results
        System.out.println("\nOriginal Text: " + inputText);
        System.out.println("Uppercase (built-in method): " + builtInUpperCase);
        System.out.println("Uppercase (custom method): " + customUpperCase);
        System.out.println("Are both uppercase conversions identical? " + areUppercaseEqual);

        System.out.println("\nLowercase (built-in method): " + builtInLowerCase);
        System.out.println("Lowercase (custom method): " + customLowerCase);
        System.out.println("Are both lowercase conversions identical? " + areLowercaseEqual);

        System.out.println("\nWords and their lengths:");
        for (String[] wordInfo : wordsWithLengths) {
            System.out.println("Word: " + wordInfo[0] + ", Length: " + wordInfo[1]);
        }

        scanner.close();
    }
}
