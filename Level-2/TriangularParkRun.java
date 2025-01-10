/*An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
I/P => side1, side2, side3
O/P => The total number of rounds the athlete will run is ___ to complete 5 km*/
import java.util.Scanner;

public class TriangularParkRun {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Take user inputs for the three sides of the triangular park
        System.out.print("Enter the length of side1 (in meters): ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the length of side2 (in meters): ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter the length of side3 (in meters): ");
        double side3 = scanner.nextDouble();
        
        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;
        
        // Convert 5 km to meters
        double distanceToRun = 5000;
        
        // Calculate the number of rounds
        double rounds = distanceToRun / perimeter;
        
        // Display the result
        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km.");
    }
}
