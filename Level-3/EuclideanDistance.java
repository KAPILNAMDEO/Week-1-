/*Write a program Euclidean distance between two points as well as the equation of the line using those two points.
 Use Math functions Math.pow() and Math.sqrt()
Hint => 
Take inputs for 2 points x1, y1, and x2, y2 
Method to find the Euclidean distance between two points and return the distance
distance = (x2-x1)2 +(y2-y1)2 
Write a Method to find the equation of a line given two points and return the equation which includes the slope and
 the y-intercept
The equation of a line is given by the equation y = m*x + b Where m is the slope and b is the y-intercept. So firstly
 compute the slope using the formulae 
m = (y2 - y1)/(x2 - x1)
Post that compute the y-intercept b using the formulae 
b = y1 - m*x1  
Finally, return an array having slope m and y-intercept b
*/
import java.util.Scanner;

public class EuclideanDistance {

    // Method to find the Euclidean distance between two points (x1, y1) and (x2, y2)
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the equation of the line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Calculate the slope of the line
        double slope = (y2 - y1) / (x2 - x1);
        
        // Calculate the y-intercept of the line
        double intercept = y1 - slope * x1;
        
        // Return an array with the slope and intercept
        return new double[]{slope, intercept};
    }

    // Method to display the equation of the line
    public static void displayLineEquation(double[] line) {
        double slope = line[0];
        double intercept = line[1];
        
        System.out.println("Equation of the line: y = " + slope + "x + " + intercept);
    }

    // Main method to input the points and calculate the distance and line equation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the points (x1, y1) and (x2, y2)
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate the Euclidean distance between the two points
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance between the points: " + distance);

        // Find the equation of the line using the two points
        double[] line = findLineEquation(x1, y1, x2, y2);

        // Display the equation of the line
        displayLineEquation(line);
    }
}

