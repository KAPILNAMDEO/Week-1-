import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] heightWeightData = new double[10][2];

        // Input height and weight for each person
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter weight (kg) for person %d: ", i + 1);
            heightWeightData[i][0] = scanner.nextDouble();

            System.out.printf("Enter height (cm) for person %d: ", i + 1);
            heightWeightData[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and status
        String[][] bmiData = computeBMIAndStatus(heightWeightData);

        // Display results
        displayResults(bmiData);
    }

    // Method to compute BMI and status
    public static String[][] computeBMIAndStatus(double[][] heightWeightData) {
        String[][] bmiData = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = heightWeightData[i][0];
            double heightInMeters = heightWeightData[i][1] / 100; // Convert height to meters
            double bmi = weight / (heightInMeters * heightInMeters);
            
            // Store height, weight, BMI, and status in string array
            bmiData[i][0] = String.format("%.2f", heightWeightData[i][1]); // Height
            bmiData[i][1] = String.format("%.2f", weight); // Weight
            bmiData[i][2] = String.format("%.2f", bmi); // BMI
            bmiData[i][3] = determineStatus(bmi); // Status
        }

        return bmiData;
    }

    // Method to determine BMI status
    public static String determineStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Method to display results in tabular format
    public static void displayResults(String[][] bmiData) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < bmiData.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s\n",
                    bmiData[i][0],
                    bmiData[i][1],
                    bmiData[i][2],
                    bmiData[i][3]);
        }
    }
}
