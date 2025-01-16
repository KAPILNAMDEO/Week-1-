import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Find the longest word in the sentence
        String longestWord = findLongestWord(sentence);

        // Display the result
        System.out.println("The longest word is: " + longestWord);

        // Close the scanner
        scanner.close();
    }

    // Method to find the longest word in a sentence
    private static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+"); // Split the sentence into words
        String longestWord = words[0]; // Initialize the longest word

        // Iterate through each word in the sentence
        for (String word : words) {
            // Check if the current word is longer than the longest word
            if (word.length() > longestWord.length()) {
                longestWord = word; // Update the longest word
            }
        }

        return longestWord; // Return the longest word
    }
}