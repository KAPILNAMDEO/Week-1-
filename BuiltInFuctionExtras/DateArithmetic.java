import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Take date input from user
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        // Convert input string to LocalDate
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Perform date arithmetic
        LocalDate modifiedDate = date.plusDays(7)   // Add 7 days
                                    .plusMonths(1)  // Add 1 month
                                    .plusYears(2)   // Add 2 years
                                    .minusWeeks(3); // Subtract 3 weeks

        // Display results
        System.out.println("Original Date: " + date.format(formatter));
        System.out.println("Modified Date: " + modifiedDate.format(formatter));

        scanner.close();
    }
}
