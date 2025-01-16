import java.util.Scanner;

public class TextSplitterTwoD {

    // Method to split text into words without using built-in split() method
    public static String[] splitText(String text) {
        StringBuilder word = new StringBuilder();
        int wordCount = 0;

        // First, count the number of words to initialize the array
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++; // Account for the last word

        String[] words = new String[wordCount];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word.append(text.charAt(i));
            } else {
                words[index++] = word.toString();
                word.setLength(0); // Clear the StringBuilder for the next word
            }
        }
        words[index] = word.toString(); // Add the last word

        return words;
    }

    // Method to find the length of a string without using length() method
    public static int getStringLength(String str) {
        int length = 0;
        try {
            while (str.charAt(length) != '\0') {
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // When exception occurs, we have reached the end of the string
        }
        return length;
    }

    // Method to create a 2D String array with words and their lengths
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a line of text: ");
        String inputText = scanner.nextLine();

        // Split text into words
        String[] words = splitText(inputText);

        // Get words and their lengths in a 2D array
        String[][] wordsWithLengths = getWordsAndLengths(words);

        // Display the result in tabular format
        System.out.println("Word            Length");
        System.out.println("-----------------------");
        for (int i = 0; i < wordsWithLengths.length; i++) {
            System.out.println(wordsWithLengths[i][0] + "            " + wordsWithLengths[i][1]);
        }

        scanner.close();
    }
}
