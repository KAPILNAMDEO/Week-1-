/*Write a program to compare two strings using the charAt() method and check the result with the built-in String 
equals() method
Hint => 
Take user input using the  Scanner next() method for 2 String variables
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result 
*/
import java.util.Scanner;

public class CompareTwoString {
    
    // Method to compare two strings using charAt() method
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Compare each character using charAt()
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for two strings
        System.out.print("Enter the first string: ");
        String string1 = scanner.next();
        
        System.out.print("Enter the second string: ");
        String string2 = scanner.next();
        
        // Compare strings using charAt()
        boolean charAtComparisonResult = compareStringsUsingCharAt(string1, string2);
        
        // Compare strings using equals() method
        boolean equalsMethodResult = string1.equals(string2);
        
        // Display the results
        System.out.println("Comparison using charAt(): " + charAtComparisonResult);
        System.out.println("Comparison using equals(): " + equalsMethodResult);
        
        // Check if both methods produce the same result
        if (charAtComparisonResult == equalsMethodResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The methods give different results.");
        }
        
        scanner.close();
    }
}
		