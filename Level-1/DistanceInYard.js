/*14.Write a program the find the distance in yards and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___*/


import java.util.Scanner;

public class DistanceInYard {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Convert feet to yards and miles
        double distanceInYards = distanceInFeet /  // 1 yard = 3 feet
        double distanceInMiles = distanceInYards /  // 1 mile = 1760 yards

        // Print the results
        System.out.println(" In feet "+" the distance in yeard is "+distanceInFeet+" and distance in miles is "+distanceInMiles);
    }
}
