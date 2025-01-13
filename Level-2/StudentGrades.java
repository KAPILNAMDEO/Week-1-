/*Create a program to take input marks of students in 3 subjects physics,
 chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines 

Hint => 
Take input for the number of students
Create arrays to store marks, percentages, and grades of the students
Take input for marks of students in physics, chemistry, and maths. If the marks are negative, 
ask the user to enter positive values and decrement the index
Calculate the percentage and grade of the students based on the percentage
Display the marks, percentages, and grades of each student
*/


import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create 1D arrays to store marks, percentages, and grades
        double[] physicsMarks = new double[numStudents];
        double[] chemistryMarks = new double[numStudents];
        double[] mathsMarks = new double[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Take input for marks of students
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            // Physics marks
            boolean validPhysicsInput = false;
            while (!validPhysicsInput) {
                System.out.print("Physics: ");
                physicsMarks[i] = scanner.nextDouble();
                if (physicsMarks[i] < 0) {
                    System.err.print("Invalid input. Please Re-enter The marks: ");
                } else {
                    validPhysicsInput = true;
                }
            }

            // Chemistry marks
            boolean validChemistryInput = false;
            while (!validChemistryInput) {
                System.out.print("Chemistry: ");
                chemistryMarks[i] = scanner.nextDouble();
                if (chemistryMarks[i] < 0) {
                    System.err.print("Invalid input. Please Re-enter The marks: ");
                } else {
                    validChemistryInput = true;
                }
            }

            // Maths marks
            boolean validMathsInput = false;
            while (!validMathsInput) {
                System.out.print("Maths: ");
                mathsMarks[i] = scanner.nextDouble();
                if (mathsMarks[i] < 0) {
                    System.err.print("Invalid input. Please Re-enter The marks: ");
                } else {
                    validMathsInput = true;
                }
            }
        }

        // Calculate percentage and grade for each student
        for (int i = 0; i < numStudents; i++) {
            double totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (totalMarks / 300) * 100;
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Display marks, percentages, and grades for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + physicsMarks[i]);
            System.out.println("Chemistry: " + chemistryMarks[i]);
            System.out.println("Maths: " + mathsMarks[i]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
            System.out.println();
        }
    }
}
