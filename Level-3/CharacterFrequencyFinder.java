import java.util.Scanner;

public class CharacterFrequencyFinder {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        // Array to store the frequency of characters (ASCII values)
        int[] frequency = new int[256];

        // Loop through the text to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Create a 2D array to store characters and their frequencies
        int uniqueCount = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2]; // 2 columns: Character, Frequency
        int index = 0;

        // Loop through the frequency array to fill the result array
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Character
                result[index][1] = String.valueOf(frequency[i]); // Frequency
                index++;
            }
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
            System.out.printf("%-10s %-10s%n", entry[0], entry[1]);
        }

        scanner.close();
    }
}