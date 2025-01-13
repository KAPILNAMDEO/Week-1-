import java.util.*;
public class UnitConverterCelsius {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = pounds * 0.453592;
        return pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = kilograms * 2.20462;
        return kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = gallons * 3.78541;
        return gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = liters * 0.264172;
        return liters2gallons;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            System.out.println(fahrenheit + " Fahrenheit is " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");
        } else if (choice == 2) {
            System.out.print("Enter Celsius: ");
            double celsius = scanner.nextDouble();
            System.out.println(celsius + " Celsius is " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");
        } else if (choice == 3) {
            System.out.print("Enter Pounds: ");
            double pounds = scanner.nextDouble();
            System.out.println(pounds + " Pounds is " + convertPoundsToKilograms(pounds) + " Kilograms.");
        } else if (choice == 4) {
            System.out.print("Enter Kilograms: ");
            double kilograms = scanner.nextDouble();
            System.out.println(kilograms + " Kilograms is " + convertKilogramsToPounds(kilograms) + " Pounds.");
        } else if (choice == 5) {
            System.out.print("Enter Gallons: ");
            double gallons = scanner.nextDouble();
            System.out.println(gallons + " Gallons is " + convertGallonsToLiters(gallons) + " Liters.");
        } else if (choice == 6) {
            System.out.print("Enter Liters: ");
            double liters = scanner.nextDouble();
            System.out.println(liters + " Liters is " + convertLitersToGallons(liters) + " Gallons.");
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
