/*Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint => 
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function 
to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)
*/
import java.util.Scanner;

public class Calculatetrignometric {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the angle in degrees from the user
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        // Call the method to calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);

        // Display the results using System.out.println
        System.out.println("Sine of " + angle + " degrees: " + results[0]);
        System.out.println("Cosine of " + angle + " degrees: " + results[1]);
        System.out.println("Tangent of " + angle + " degrees: " + results[2]);

        scanner.close();
    }

    // Method to calculate sine, cosine, and tangent of an angle
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle to radians
        double radians = Math.toRadians(angle);

        // Calculate trigonometric functions
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results in an array
        return new double[] {sine, cosine, tangent};
    }
}
