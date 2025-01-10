/*Similarly, write the DoubleOpt program by taking double values and doing the same operations.*/

import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the value of a (double): ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the value of b (double): ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter the value of c (double): ");
        double c = scanner.nextDouble();
        
        
        double result1 = a + b * c;   // Multiplication (*) has higher precedence than addition (+)
        double result2 = a * b + c;   // Multiplication (*) is done before addition (+)
        double result3 = c + a / b;   // Division (/) is done before addition (+)
        double result4 = a % b + c;   // Modulus (%) is done before addition (+)
        
        
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
    }
}
