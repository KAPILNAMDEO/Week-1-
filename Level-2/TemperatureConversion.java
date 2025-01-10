/*Write a TemperatureConversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit
Hint => 
Create a celsius variable and take the temperature as user input
Use the Formulae Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F and assign to farenheitResult  and print the result
I/P => celcius
O/P =>  The ____ celsius is _____ fahrenheit*/
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Convert Celsius to Fahrenheit using the formula
        double fahrenheitResult = (celsius * 9 / 5) + 32;
        
        // Display the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");
    }
}
