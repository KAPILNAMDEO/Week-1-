import java.util.Scanner;

public class CharacterFrequencyFinderUsingNested {

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String text) {
        // Convert the string to a character array
        char[] characters = text.toCharArray();
        int length = characters.length;

        // Array to store the frequency of each character
        int[] frequency = new int[length];

        // Loop to find the frequency of each character
        for (int i = 0; i < length; i++) {
            // If the character is already counted, skip it
            if (frequency[i] == 0) {
                frequency[i] = 1; // Initialize frequency to 1

                // Inner loop to check for duplicates
                for (int j = i + 1; j < length; j++) {
                    if (characters[i] == characters[j]) {
                        frequency[i]++; // Increment frequency
                        frequency[j] = 0; // Set duplicate character's frequency to 0
                    }
                }
            }
        }

        // Create a 1D array to store the characters and their frequencies
        String[] result = new String[length];
        int index = 0;

        // Store characters and their frequencies in the result array
        for (int i = 0; i < length; i++) {
            if (frequency[i] > 0) { // Only consider characters with frequency > 0
                result[index] = characters[i] + ": " + frequency[i];
                index++;
            }
        }

        // Resize the result array to remove null entries
        String[] finalResult = new String[index];
        System.arraycopy(result, 0, finalResult, 0, index);

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the character frequencies
        String[] frequencies = findCharacterFrequency(input);

        // Display the result
        System.out.println("Character Frequencies:");
        for (String entry : frequencies) {
            System.out.println(entry);
        }

        scanner.close();
    }
}