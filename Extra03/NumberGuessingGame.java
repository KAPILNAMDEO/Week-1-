import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");
        System.out.println("Type 'high' if my guess is too high, 'low' if it's too low, and 'correct' if I guessed it right.");
        
        int low = 1, high = 100;
        boolean guessedCorrectly = false;
        
        while (!guessedCorrectly) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (high/low/correct)");

            String feedback = scanner.next().toLowerCase();
            
            guessedCorrectly = processFeedback(feedback, guess);

            if (feedback.equals("high")) {
                high = guess - 1; // Narrow down range
            } else if (feedback.equals("low")) {
                low = guess + 1; // Narrow down range
            }
        }
        
        System.out.println("Yay! I guessed your number!");
        scanner.close();
    }

    // Method to generate a guess using a random number within the given range
    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return low + random.nextInt(high - low + 1);
    }

    // Method to process user feedback
    public static boolean processFeedback(String feedback, int guess) {
        if (feedback.equals("correct")) {
            return true;
        } else if (!feedback.equals("high") && !feedback.equals("low")) {
            System.out.println("Invalid input! Please enter 'high', 'low', or 'correct'.");
        }
        return false;
    }
}
