/*Create a program to convert weight in pounds to kilograms.
Hint => 1 pound = 2.2 kg
I/P => weight
O/P => The weight of the person in pound is ___ and in kg is ___*/
import java.util.Scanner;

public class WeightToPounds {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scanner.nextDouble();
        
        // Convert weight to kilograms (1 pound = 2.2 kg)
        double weightInKilograms = weightInPounds * 2.2;
        
        // Display the result
        System.out.println("The weight of the person in pound is " + weightInPounds + " and in kg is " + weightInKilograms);
    }
}
