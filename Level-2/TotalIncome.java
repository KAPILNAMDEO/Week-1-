/*Create a program to find the total income of a person by taking salary and bonus from user
Hint => 
Create a variable named salary and take user input.
Create another variable bonus and take user input.
Compute income by adding salary and bonus and print the result
I/P => salary, bonus
O/P => The salary is INR ___ and bonus is INR ___. Hence Total Income is INR ___*/

import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the salary (INR): ");
        double salary = scanner.nextDouble();
        
        
        System.out.print("Enter the bonus (INR): ");
        double bonus = scanner.nextDouble();
        
        // Calculate the total income
        double totalIncome = salary + bonus;
        
        // Display the results
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus 
                           + ". Hence Total Income is INR " + totalIncome);
    }
}
