
import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {

        // To input via Scanner
        Scanner scanner = new Scanner(System.in);

        // Arrays to store the values for age and height of 3 friends
        int[] friendAges = new int[3];
        double[] friendHeights = new double[3];

        // Input ages
        for (int i = 0; i < friendAges.length; i++) {
            System.out.print("Enter the age of friend " + (i + 1) + ": ");
            friendAges[i] = scanner.nextInt();
        }

        // Input heights
        for (int i = 0; i < friendHeights.length; i++) {
            System.out.print("Enter the height of friend " + (i + 1) + " (in centimeters): ");
            friendHeights[i] = scanner.nextDouble();
        }

        // Variables to store the index of the youngest and tallest friends
        int youngestFriendIndex = 0;
        int tallestFriendIndex = 0;

        // Find the youngest friend
        for (int i = 1; i < friendAges.length; i++) {
            if (friendAges[i] < friendAges[youngestFriendIndex]) {
                youngestFriendIndex = i;
            }
        }

        // Find the tallest friend
        for (int i = 1; i < friendHeights.length; i++) {
            if (friendHeights[i] > friendHeights[tallestFriendIndex]) {
                tallestFriendIndex = i;
            }
        }

        // Displaying the youngest and tallest friend
        System.out.println("\nThe youngest friend is: Friend " + (youngestFriendIndex + 1) 
            + " with age " + friendAges[youngestFriendIndex]);
        System.out.println("The tallest friend is: Friend " + (tallestFriendIndex + 1) 
            + " with height " + friendHeights[tallestFriendIndex] + " cm.");

        scanner.close();
    }
}



			