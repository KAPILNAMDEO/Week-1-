import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize counters
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the input string to lowercase to make the check case-insensitive
        String lowerCaseInput = input.toLowerCase();

        // Iterate through each character in the string
        for (char ch : lowerCaseInput.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (isVowel(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        // Display the results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        // Close the scanner
        scanner.close();
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}