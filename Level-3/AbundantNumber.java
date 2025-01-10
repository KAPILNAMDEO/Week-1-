import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the sum of divisors
        int sum = 0;

        // Use a for loop to find divisors and add them to sum
        for (int i = 1; i < number; i++) {
            // Check if i is a divisor of the number
            if (number % i == 0) {
                // Add i to sum if it's a divisor
                sum += i;
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        
        scanner.close();
    }
}
