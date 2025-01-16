/*Write a program to split the text into words, compare the result with the split() method and display the result 
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to find the length of the String without using the built-in length() method. 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method
 and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in 
a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined method to 
compare the two string arrays and display the result
*/
import java.util.Scanner;

public class SplitTextIntoWord {

    // Method to find the length of the string without using length() method
    public static int getStringLength(String text) {
        int length = 0;
        int index = 0;
        try {
            while (true) {
                text.charAt(index);
                length++;
                index++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached the end of the string
        }
        return length;
    }

    // Method to split the text into words without using split() method
    public static String[] splitText(String text) {
        int length = getStringLength(text);
        int wordCount = 1; // At least one word exists

        // Count spaces to determine the number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder currentWord = new StringBuilder();

        // Traverse the text and extract words
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            if (currentChar == ' ') {
                words[wordIndex++] = currentWord.toString();
                currentWord.setLength(0); // Reset the StringBuilder for the next word
            } else {
                currentWord.append(currentChar);
            }
        }

        // Add the last word
        words[wordIndex] = currentWord.toString();

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();

        // User-defined split method
        String[] userDefinedSplit = splitText(inputText);

        // Built-in split method
        String[] builtInSplit = inputText.split(" ");

        // Compare the results
        boolean areEqual = compareStringArrays(userDefinedSplit, builtInSplit);

        // Display results
        System.out.println("User-defined split result:");
        for (String word : userDefinedSplit) {
            System.out.println(word);
        }

        System.out.println("Built-in split result:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("Are the results identical? " + areEqual);

        scanner.close();
    }
}
