import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Iterative method to check if the text is a palindrome
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // Characters do not match
            }
            start++;
            end--;
        }
        return true; // All characters matched
    }

    // Logic 2: Recursive method to check if the text is a palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true; // Base case: all characters matched
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false; // Characters do not match
        }
        return isPalindromeRecursive(text, start + 1, end - 1); // Recursive call
    }

    // Logic 3: Method to reverse the string and check for palindrome
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] originalArray = text.toCharArray();
        char[] reverseArray = new char[originalArray.length];

        // Reverse the string using charAt()
        for (int i = 0; i < originalArray.length; i++) {
            reverseArray[i] = originalArray[originalArray.length - 1 - i];
        }

        // Compare original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false; // Characters do not match
            }
        }
        return true; // All characters matched
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check for palindrome using all three methods
        boolean isPalindrome1 = isPalindromeIterative(input);
        boolean isPalindrome2 = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean isPalindrome3 = isPalindromeUsingCharArray(input);

        // Display results
        System.out.println("Palindrome Check Results:");
        System.out.println("Iterative Method: " + (isPalindrome1 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Recursive Method: " + (isPalindrome2 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Char Array: " + (isPalindrome3 ? "Palindrome" : "Not a Palindrome"));

        scanner.close();
    }
}