/*Write a program that takes a year as input and outputs the Year is a Leap Year or not 
Hint => 
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. 
Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
Write a method to check for Leap Year using the conditions a and b
*/
import java.util.Scanner;

public class LeafYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();
        scanner.close();

        // Check if the year is valid
        if (year < 1582) {
            System.out.println("Invalid year. Please enter a year >= 1582.");
            System.exit(0);
        }

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
    // Condition a: year is divisible by 4
    if (year % 4 != 0) {
        return false; // Not a leap year if not divisible by 4
    }

    // Condition b: year is not divisible by 100, unless it is also divisible by 400
    if (year % 100 == 0) {
        if (year % 400 == 0) {
            return true; // Leap year if divisible by 400
        } else {
            return false; // Not a leap year if divisible by 100 but not 400
        }
    }

    return true; // Leap year if divisible by 4 and not by 100
	}

}
