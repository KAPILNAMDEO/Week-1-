import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input string from the user
        String inputString = getInputString(scanner);
        
        // Checking if the string is a palindrome
        boolean isPalindrome = checkPalindrome(inputString);
        
        // Displaying the result
        displayResult(inputString, isPalindrome);
        
        scanner.close();
    }

    // Function to take input string from the user
    public static String getInputString(Scanner scanner) {
        System.out.print("Enter a string to check if it's a palindrome: ");
        return scanner.nextLine();
    }

    // Function to check if the string is a palindrome
    public static boolean checkPalindrome(String str) {
        // Removing spaces and converting the string to lower case for case-insensitive comparison
        str = str.replaceAll("\\s+", "").toLowerCase();
        
        // Loop to check if the string reads the same backward as forward
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false; // Not a palindrome if characters don't match
            }
        }
        return true; // It's a palindrome if all characters match
    }

    // Function to display the result
    public static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}
