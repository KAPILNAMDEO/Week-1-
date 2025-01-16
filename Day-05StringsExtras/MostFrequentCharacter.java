import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the most frequent character
        char mostFrequentChar = findMostFrequentCharacter(input);
        int frequency = countCharacterFrequency(input, mostFrequentChar);

        // Display the result
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "' with frequency: " + frequency);

        // Close the scanner
        scanner.close();
    }

    // Method to find the most frequent character in a string
    private static char findMostFrequentCharacter(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>(); // To store character frequencies
        char mostFrequentChar = str.charAt(0); // Initialize with the first character
        int maxFrequency = 0; // Initialize max frequency

        // Count the frequency of each character
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            // Update most frequent character if needed
            if (frequencyMap.get(ch) > maxFrequency) {
                maxFrequency = frequencyMap.get(ch);
                mostFrequentChar = ch;
            }
        }

        return mostFrequentChar; // Return the most frequent character
    }

    // Method to count the frequency of a specific character
    private static int countCharacterFrequency(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count; // Return the frequency count
    }
}