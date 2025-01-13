/*Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
Finally display the youngest and tallest of the 3 friends
*/

import java.util.Scanner;

public class YoungestAndtTallest {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner userInput = new Scanner(System.in);

        // Arrays to store age and height of friends
        int[] friendAges = new int[3];
        double[] friendHeights = new double[3];

        // Input age and height of friends
        for (int i = 0; i < friendAges.length; i++) {
            System.out.println("Enter the age of friend " + (i + 1) + ": ");
            friendAges[i] = userInput.nextInt();
        }

        for (int i = 0; i < friendHeights.length; i++) {
            System.out.println("Enter the height of friend " + (i + 1) + " (in centimeters): ");
            friendHeights[i] = userInput.nextDouble();
        }

        // Variables to store index of youngest and tallest friends
        int juniorIndex = 0;
        int tallestIndex = 0;

        // Find youngest friend
        for (int i = 0; i < friendAges.length; i++) {
            if (friendAges[i] < friendAges[juniorIndex]) {
                juniorIndex = i;
            }
        }

        // Find tallest friend
        for (int i = 0; i < friendHeights.length; i++) {
            if (friendHeights[i] > friendHeights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display youngest and tallest friends
        System.out.println("\nThe youngest friend is: Friend " + (juniorIndex + 1) + " with age " + friendAges[juniorIndex]);
        System.out.println("The tallest friend is: Friend " + (tallestIndex + 1) + " with height " + friendHeights[tallestIndex] + " cm.");

        
    }
}


			