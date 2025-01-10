import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt();

        System.out.print("Enter day: ");
        int d = scanner.nextInt();

        System.out.print("Enter year: ");
        int y = scanner.nextInt();

        // Use the given formulas to calculate the day of the week
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Print the result: the value of d0 represents the day of the week
        System.out.println("Day of the week (0 for Sunday, 1 for Monday, etc.): " + d0);

        // Close the scanner
        scanner.close();
    }
}

