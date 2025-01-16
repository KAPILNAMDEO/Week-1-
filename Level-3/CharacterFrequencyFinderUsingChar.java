import java.util.Scanner;

public class CharacterFrequencyFinderUsingChar {

    // Method to find unique characters in a string using charAt() method
    public static char[] uniqueCharacters(String text) {
        // Create an array to store unique characters
        char[] uniqueChars = new char[text.length()];
        int uniqueCount = 0;

        // Loop through the text to find unique characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if currentChar is already in uniqueChars
            for (int j = 0; j < uniqueCount; j++) {
                if (currentChar == uniqueChars[j]) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array to store only the unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        // Array to store the frequency of characters (ASCII values)
        int[] frequency = new int[256];

        // Loop through the text to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Call the uniqueCharacters() method to find the unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Create a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2]; // 2 columns: Character, Frequency

        // Loop through the unique characters to fill the result array
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]); // Character
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]); // Frequency
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the character frequencies
        String[][] frequencies = findCharacterFrequency(input);

        // Display the result
        System.out.println("Character Frequencies:");
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("--------------------------");
        for (String[] entry : frequencies) {
            // Only display characters that are not null
            if (entry[0] != null) {
                System.out.printf("%-10s %-10s%n", entry[0], entry[1]);
            }
        }

        scanner.close();
    }
}