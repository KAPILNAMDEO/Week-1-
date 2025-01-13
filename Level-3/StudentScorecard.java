import java.util.Random;

public class StudentScorecard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math for each student
    public static int[][] generateScores(int numberOfStudents) {
        Random rand = new Random();
        int[][] scores = new int[numberOfStudents][3]; // 2D array to store scores for each student

        for (int i = 0; i < numberOfStudents; i++) {
            // Generating random scores for each subject (between 0 to 99)
            scores[i][0] = rand.nextInt(100); // Physics score
            scores[i][1] = rand.nextInt(100); // Chemistry score
            scores[i][2] = rand.nextInt(100); // Math score
        }

        return scores;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][5]; // 2D array to store results for each student

        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j]; // Sum of all three subject scores
            }

            double average = total / 3.0; // Average score
            double percentage = (total / 300.0) * 100; // Percentage score

            // Round the values to 2 decimal places
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;

            // Assigning the grade based on percentage
            results[i][3] = assignGrade(percentage);
        }

        return results;
    }

    // Method to assign grades based on percentage
    public static double assignGrade(double percentage) {
        if (percentage >= 80) {
            return 'A';
        } else if (percentage >= 70) {
            return 'B';
        } else if (percentage >= 60) {
            return 'C';
        } else if (percentage >= 50) {
            return 'D';
        } else if (percentage >= 40) {
            return 'E';
        } else {
            return 'R'; // Remedial standards
        }
    }

    // Method to display the scorecard for all students
    public static void displayScoreCard(int[][] scores, double[][] results) {
        // Display header with percentage column added
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d%-10d%-10d%-10d%-10.2f%-10.2f%-10.2f%-10c\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], (char) results[i][3]);
        }
    }

    public static void main(String[] args) {
        // Get the number of students from the user
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generate random scores for all students
        int[][] scores = generateScores(numberOfStudents);

        // Calculate the total, average, and percentage for each student
        double[][] results = calculateResults(scores);

        // Display the scorecard with the added percentage column
        displayScoreCard(scores, results);
    }
}
