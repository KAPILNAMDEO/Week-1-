/*Create a program to find the bonus of 10 employees based on their years of service and the total bonus 
amount the company Zara has to pay, along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Define a double array to save salary and years of service for each of the 10 employees
Also define a double array to save the new salary and the bonus amount as well as variables to save the total bonus, 
total old salary, and new salary
Define a loop to take input from the user. If salary or year of service is an invalid number then ask the use to enter
 again. Note in this case you will have to decrement the index counter
Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the 
array, compute the new salary, and save in the array. Also, the total bonus and total old and new salary can be
 calculated in the loop
Print the total bonus payout as well as the total old and new salary of all the employees
*/





import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {
        // Initialize a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Define 2D arrays to store employee data and bonus information
        double[][] employeeData = new double[10][2]; // stores salary and years of service
        double[][] bonusData = new double[10][2]; // stores new salary and bonus amount

        // Initialize variables to track total bonus, old salary, and new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Loop through each employee to collect salary and years of service
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            // Validate salary input
            while (true) {
                System.out.print("Salary: ");
                employeeData[i][0] = input.nextDouble();
                if (employeeData[i][0] < 0) {
                    System.err.println("Invalid input! Salary cannot be negative. Please try again.");
                } else {
                    break; // Exit loop when valid salary is entered
                }
            }

            // Validate years of service input
            while (true) {
                System.out.print("Years of service: ");
                employeeData[i][1] = input.nextDouble();
                if (employeeData[i][1] < 0) {
                    System.err.println("Invalid input! Years of service cannot be negative. Please try again.");
                } else {
                    break; // Exit loop when valid years of service are entered
                }
            }
        }

        // Calculate bonus and new salary for each employee
        for (int i = 0; i < 10; i++) {
            double bonus;
            if (employeeData[i][1] > 5) {
                bonus = employeeData[i][0] * 0.05; // 5% bonus for 5+ years of service
            } else {
                bonus = employeeData[i][0] * 0.02; // 2% bonus for less than 5 years of service
            }

            // Store new salary and bonus amount
            bonusData[i][0] = employeeData[i][0] + bonus;
            bonusData[i][1] = bonus;

            // Update total bonus, old salary, and new salary
            totalBonus += bonus;
            totalOldSalary += employeeData[i][0];
            totalNewSalary += bonusData[i][0];
        }

        // Display total bonus payout, total old salary, and total new salary
        System.out.println("\nTotal bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);

        // Display employee details, including old salary, years of service, bonus, and new salary
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Old Salary: " + employeeData[i][0]);
            System.out.println("Years of Service: " + employeeData[i][1]);
            System.out.println("Bonus: " + bonusData[i][1]);
            System.out.println("New Salary: " + bonusData[i][0]);
            System.out.println();
        }

        // Close the Scanner object
        input.close();
    }
}
