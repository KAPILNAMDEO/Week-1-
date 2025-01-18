import java.util.Scanner;

public class GcdLcmCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Calculating GCD and LCM
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);
        
        // Displaying the result
        displayResult(gcd, lcm);
        
        scanner.close();
    }

    // Function to calculate the Greatest Common Divisor (GCD)
    public static int calculateGCD(int a, int b) {
        // Using Euclidean algorithm to calculate GCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate the Least Common Multiple (LCM)
    public static int calculateLCM(int a, int b, int gcd) {
        // Formula to calculate LCM using GCD
        return Math.abs(a * b) / gcd;
    }

    // Function to display the result
    public static void displayResult(int gcd, int lcm) {
        System.out.println("The GCD is: " + gcd);
        System.out.println("The LCM is: " + lcm);
    }
}

