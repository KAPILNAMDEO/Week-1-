import java.util.Scanner;

public class VotingEligibility {

    // Method to generate random ages for n students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 90) + 10; // Generates a random age between 10 and 99
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Cannot Vote";
            } else if (ages[i] >= 18) {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Can Vote";
            } else {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // Method to display the results in a tabular format
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-15s%n", "Age", "Voting Eligibility");
        System.out.println("-------------------------");
        for (String[] result : results) {
            System.out.printf("%-10s %-15s%n", result[0], result[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = 10;
        int[] ages = new int[numberOfStudents];

        // Taking user input for ages
        System.out.println("Please enter the ages of " + numberOfStudents + " students:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        // Check voting eligibility
        String[][] results = checkVotingEligibility(ages);

        // Display results
        displayResults(results);

        scanner.close();
    }
}