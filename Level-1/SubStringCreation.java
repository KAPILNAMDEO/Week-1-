/*Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
Hint => 
Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result

*/



import java.util.Scanner;

public class SubStringCreation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        String substringUsingCharAt = createSubstringUsingCharAt(inputString, startIndex, endIndex);
        String substringUsingBuiltIn = inputString.substring(startIndex, endIndex);

        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using built-in substring(): " + substringUsingBuiltIn);

        boolean areEqual = compareTwoStringsUsingCharAt(substringUsingCharAt, substringUsingBuiltIn);

        if (areEqual) {
            System.out.println("Both substrings are equal.");
        } else {
            System.out.println("Both substrings are not equal.");
        }

        scanner.close();
    }

   
    public static String createSubstringUsingCharAt(String inputString, int startIndex, int endIndex) {
        StringBuilder substring = new StringBuilder();
        for (int i = startIndex; i < endIndex; i++) {
            substring.append(inputString.charAt(i));
        }
        return substring.toString();
    }

    
    public static boolean compareTwoStringsUsingCharAt(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}


