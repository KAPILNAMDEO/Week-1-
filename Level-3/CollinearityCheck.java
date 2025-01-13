/*Write a program to find the 3 points that are collinear using the slope formulae and area of triangle formulae. check
  A (2, 4), B (4, 6) and C (6, 8) are Collinear for sampling. 
Hint => 
Take inputs for 3 points x1, y1, x2, y2, and x3, y3
Write a Method to find the 3 points that are collinear using the slope formula. The 3 points A(x1,y1), b(x2,y2), 
and c(x3,y3) are collinear if the slopes formed by 3 points ab, bc, and cd are equal. 
slope AB = (y2 - y1)/(x2 - x1), slope BC = (y3 - y2)/(x3 - x3)
slope AC = (y3 - y1)/(x3 - x1) Points are collinear if
slope AB = slope BC = slope Ac
The method to find the three points is collinear using the area of the triangle formula. The Three points are collinear
 if the area of the triangle formed by three points is 0. The area of a triangle is 
       

area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))
*/
import java.util.Scanner;

public class CollinearityCheck {

    // Method to check if three points are collinear using the area of the triangle formula
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area of the triangle formed by points (x1, y1), (x2, y2), and (x3, y3)
        double area = 0.5 * Math.abs((x1 - x2) * (y2 - y3) - (y1 - y2) * (x2 - x3));
        
        // If area is 0, points are collinear
        return area == 0;
    }

    // Method to check if three points are collinear using the slope formula
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the slope between points A and B (Slope AB)
        double slopeAB = (y2 - y1) / (x2 - x1);
        
        // Calculate the slope between points B and C (Slope BC)
        double slopeBC = (y3 - y2) / (x3 - x2);
        
        // Calculate the slope between points A and C (Slope AC)
        double slopeAC = (y3 - y1) / (x3 - x1);
        
        // Points are collinear if all slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the three points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        // Check if the points are collinear using the area formula
        boolean collinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        if (collinearByArea) {
            System.out.println("The points are collinear using area formula.");
        } else {
            System.out.println("The points are not collinear using area formula.");
        }

        // Check if the points are collinear using the slope formula
        boolean collinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        if (collinearBySlope) {
            System.out.println("The points are collinear using slope formula.");
        } else {
            System.out.println("The points are not collinear using slope formula.");
        }

        scanner.close();
    }
}


