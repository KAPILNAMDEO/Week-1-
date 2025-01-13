/*Create a program to take a number as input find the frequency of each digit in the number
 using an array and display the frequency of each digit
Hint => 
Take the input for a number
Find the count of digits in the number
Find the digits in the number and save them in an array
Find the frequency of each digit in the number. For this define
 a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
Display the frequency of each digit in the number
*/


import java.util.Scanner;

public class FrequencyOfEachDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the count of digits in the number
        int digitCount = 0;
        int tempNumber = Math.abs(number);
        while (tempNumber > 0) {
            tempNumber /= 10;
            digitCount++;
        }

        // Find the digits in the number and save them in an array
        int[] digits = new int[digitCount];
        tempNumber = Math.abs(number);
        for (int i = 0; i < digitCount; i++) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }

        // Reverse the digits array since we extracted digits in reverse order
        for (int i = 0; i < digitCount / 2; i++) {
            int temp = digits[i];
            digits[i] = digits[digitCount - 1 - i];
            digits[digitCount - 1 - i] = temp;
        }

        // Find the frequency of each digit in the number
        int[] frequency = new int[10];
        for (int i = 0; i < digitCount; i++) {
            frequency[digits[i]]++;
        }

        // Display the frequency of each digit in the number
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}


