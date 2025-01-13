/*Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique
 by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
Hint => 
Write a method to Generate a 6-digit OTP number using Math.random() 
Create an array to save the OTP numbers generated 10 times
Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false
*/

import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class GenerateOtp {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999
        return 100000 + (int) (Math.random() * 900000);
    }

    // Method to ensure that all generated OTP numbers are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
               if (otps[i] == otps[j]) {
                return false; // Duplicate OTP found
               }
            }
        }
        return true; // All OTPs are unique
    }


    public static void main(String[] args) {
        // Array to store the generated OTP numbers
        int[] otps = new int[10];

        // Generate OTPs 10 times and store them in the array
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otps[i]);
        }

        // Check if all generated OTP numbers are unique
        boolean isUnique = areOTPsUnique(otps);
        if (isUnique) {
            System.out.println("\nAll generated OTP numbers are unique.");
        } else {
            System.out.println("\nSome OTP numbers are duplicate.");
        }
    }
}


