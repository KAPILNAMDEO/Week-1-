/*
Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please 
define static methods for all the UnitConvertor class methods. E.g. 
public static double convertKmToMiles(double km) => 
Method To convert kilometers to miles and return the value. Use the following code  double km2miles = 0.621371;
Method to convert miles to kilometers and return the value. Use the following code  double miles2km = 1.60934;
Method to convert meters to feet and return the value. Use the following code to convert  double meters2feet=3.28084;
Method to convert feet to meters and return the value. Use the following code to convert  double feet2meters=0.3048;
*/
import java.util.Scanner;

public class UnitConverter {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit Converter");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter kilometers: ");
                double kilometers = scanner.nextDouble();
                System.out.println(kilometers + " km is " + convertKmToMiles(kilometers) + " miles.");
                break;
            case 2:
                System.out.print("Enter miles: ");
                double miles = scanner.nextDouble();
                System.out.println(miles + " miles is " + convertMilesToKm(miles) + " kilometers.");
                break;
            case 3:
                System.out.print("Enter meters: ");
                double meters = scanner.nextDouble();
                System.out.println(meters + " meters is " + convertMetersToFeet(meters) + " feet.");
                break;
            case 4:
                System.out.print("Enter feet: ");
                double feet = scanner.nextDouble();
                System.out.println(feet + " feet is " + convertFeetToMeters(feet) + " meters.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
