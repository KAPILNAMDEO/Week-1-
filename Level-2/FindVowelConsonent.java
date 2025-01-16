import java.util.Scanner;

public class FindVowelConsonent {

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

    // Method to find the shortest and longest words
    public static String[] findShortestAndLongest(String[][] wordsWithLengths) {
        String shortest = wordsWithLengths[0][0];
        String longest = wordsWithLengths[0][0];

        for (int i = 1; i < wordsWithLengths.length; i++) {
            if (getStringLength(wordsWithLengths[i][0]) < getStringLength(shortest)) {
                shortest = wordsWithLengths[i][0];
            }
            if (getStringLength(wordsWithLengths[i][0]) > getStringLength(longest)) {
                longest = wordsWithLengths[i][0];
            }
        }

        return new String[]{shortest, longest};
    }

    // Method to check if a character is a vowel or consonant
    public static String checkVowelOrConsonant(char ch) {
        // Convert character to lowercase if it is uppercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check if the character is a consonant
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            String result = checkVowelOrConsonant(text.charAt(i));
            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
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

        // Find the shortest and longest words
        String[] shortestAndLongest = findShortestAndLongest(wordsWithLengths);

        // Count vowels and consonants
        int[] vowelConsonantCount = countVowelsAndConsonants(inputText);

        // Display the result in tabular format
        System.out.println("Word            Length");
        System.out.println("-----------------------");
        for (int i = 0; i < wordsWithLengths.length; i++) {
            System.out.println(wordsWithLengths[i][0] + "            " + wordsWithLengths[i][1]);
        }

        // Display the shortest and longest words
        System.out.println("\nShortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);

        // Display the count of vowels and consonants
        System.out.println("\nNumber of vowels: " + vowelConsonantCount[0]);
        System.out.println("Number of consonants: " + vowelConsonantCount[1]);

        scanner.close();
    }
}
