/*Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount
 the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Create a Method to determine the Salary and years of service and return the same. Use the Math.random() method to 
determine the 5-digit salary for each employee and also use the random method to determine the years of service. 
Define 2D Array to save the salary and years of service.
Write a Method to calculate the new salary and bonus based on the logic defined above and return the new 2D Array 
of the latest salary and bonus amount 
Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and
 display it in a Tabular Format
*/



import java.util.Random;

public class ZaraBonus {

    // Method to generate salary and years of service for 10 employees
    public static int[][] generateEmployeeData() {
        Random rand = new Random();
        int[][] employeeData = new int[10][2]; // 10 employees, [0] = salary, [1] = years of service

        for (int i = 0; i < 10; i++) {
            // Generate a 5-digit salary between 30000 and 99999
            employeeData[i][0] = rand.nextInt(70000) + 30000;

            // Generate years of service between 1 and 20 years
            employeeData[i][1] = rand.nextInt(20) + 1;
        }

        return employeeData;
    }

    // Method to calculate new salary and bonus based on years of service
    public static double[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        double[][] newEmployeeData = new double[10][3]; // 10 employees, [0] = new salary, [1] = bonus, [2] = old salary

        for (int i = 0; i < 10; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus = 0;

            // Calculate bonus based on years of service
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05;
            } else {
                bonus = oldSalary * 0.02;
            }

            // Calculate new salary
            double newSalary = oldSalary + bonus;

            // Save the old salary, new salary, and bonus
            newEmployeeData[i][0] = newSalary;
            newEmployeeData[i][1] = bonus;
            newEmployeeData[i][2] = oldSalary;
        }

        return newEmployeeData;
    }

    // Method to calculate sum of old salary, sum of new salary, and total bonus amount
    public static void calculateSums(int[][] employeeData, double[][] newEmployeeData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        // Print the header for the table
        System.out.printf("%-10s%-15s%-15s%-15s%-15s\n", "Employee", "Old Salary", "New Salary", "Bonus", "Years of Service");

        // Print the data for each employee and calculate the sums
        for (int i = 0; i < 10; i++) {
            int oldSalary = employeeData[i][0];
            double newSalary = newEmployeeData[i][0];
            double bonus = newEmployeeData[i][1];
            int yearsOfService = employeeData[i][1];

            System.out.printf("%-10d%-15d%-15.2f%-15.2f%-15d\n", i + 1, oldSalary, newSalary, bonus, yearsOfService);

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        // Print the sums
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus Amount: " + totalBonus);
    }

    public static void main(String[] args) {
        // Generate employee data (salary and years of service)
        int[][] employeeData = generateEmployeeData();

        // Calculate new salary and bonus
        double[][] newEmployeeData = calculateNewSalaryAndBonus(employeeData);

        // Calculate and display sums
        calculateSums(employeeData, newEmployeeData);
    }
}

