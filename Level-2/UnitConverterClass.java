/*
Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following. 
Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertYardsToFeet(double yards) => 
Method to convert yards to feet and return the value. Use following code to convert  double yards2feet = 3;
Method to convert feet to yards and return the value. Use following code to convert  double feet2yards = 0.333333;
Method to convert meters to inches and return the value. Use following code to convert  double meters2inches = 39.3701;
Method to convert inches to meters and return the value. Use following code to convert  double inches2meters = 0.0254;
Method to convert inches to centimeters and return the value. Use the following code  double inches2cm = 2.54;
*/
import java.util.Scanner;

public class UnitConverterClass{

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();
        System.out.println(kilometers + " km is " + convertKmToMiles(kilometers) + " miles.");

        System.out.print("Enter distance in miles: ");
        double miles = scanner.nextDouble();
        System.out.println(miles + " miles is " + convertMilesToKm(miles) + " kilometers.");

        System.out.print("Enter distance in meters: ");
        double meters = scanner.nextDouble();
        System.out.println(meters + " meters is " + convertMetersToFeet(meters) + " feet.");

        System.out.print("Enter distance in feet: ");
        double feet = scanner.nextDouble();
        System.out.println(feet + " feet is " + convertFeetToMeters(feet) + " meters.");

        System.out.print("Enter distance in yards: ");
        double yards = scanner.nextDouble();
        System.out.println(yards + " yards is " + convertYardsToFeet(yards) + " feet.");

        System.out.print("Enter distance in feet: ");
        feet = scanner.nextDouble();
        System.out.println(feet + " feet is " + convertFeetToYards(feet) + " yards.");

        System.out.print("Enter distance in meters: ");
        meters = scanner.nextDouble();
        System.out.println(meters + " meters is " + convertMetersToInches(meters) + " inches.");

        System.out.print("Enter distance in inches: ");
        double inches = scanner.nextDouble();
        System.out.println(inches + " inches is " + convertInchesToMeters(inches) + " meters.");
        System.out.println(inches + " inches is " + convertInchesToCm(inches) + " centimeters.");

        scanner.close();
    }
}
