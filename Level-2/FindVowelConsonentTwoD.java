import java.util.Scanner;

public class FindVowelConsonentTwoD {

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

    // Method to find vowels and consonants in a string and return a 2D array
    public static String[][] analyzeCharacters(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkVowelOrConsonant(ch);
        }

        return result;
    }

    // Method to display a 2D array in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("Character      Type");
        System.out.println("----------------------");
        for (String[] row : data) {
            System.out.printf("%-15s %s%n", row[0], row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a line of text: ");
        String inputText = scanner.nextLine();

        // Analyze characters and display results
        String[][] characterAnalysis = analyzeCharacters(inputText);
        displayTable(characterAnalysis);

        scanner.close();
    }
}
