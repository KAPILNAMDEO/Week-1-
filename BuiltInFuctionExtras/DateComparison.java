import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Input first date
        System.out.print("Enter the first date (dd/MM/yyyy): ");
        String firstDateInput = scanner.nextLine();
        LocalDate firstDate = null;

        // Input second date
        System.out.print("Enter the second date (dd/MM/yyyy): ");
        String secondDateInput = scanner.nextLine();
        LocalDate secondDate = null;

        // Parse the first date
        try {
            firstDate = LocalDate.parse(firstDateInput, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format for the first date. Please use dd/MM/yyyy.");
            return;
        }

        // Parse the second date
        try {
            secondDate = LocalDate.parse(secondDateInput, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format for the second date. Please use dd/MM/yyyy.");
            return;
        }

        // Compare the dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("The first date is the same as the second date.");
        }

        // Close the scanner
        scanner.close();
    }
}