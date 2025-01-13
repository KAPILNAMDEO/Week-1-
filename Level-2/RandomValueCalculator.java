import java.util.Scanner;

public class RandomValueCalculator {

    // Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate random 4-digit number between 1000 and 9999
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return randomNumbers;
    }

    // Method to find average, min, and max value of an array
    public double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        // Calculate sum, min, and max
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculate average
        double average = sum / numbers.length;

        // Return an array containing average, min, and max
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomValueCalculator calculator = new RandomValueCalculator();

        // Take user input for the number of random values
        System.out.print("Enter the number of 4-digit random values to generate: ");
        int size = scanner.nextInt();

        // Generate the random 4-digit values
        int[] randomNumbers = calculator.generate4DigitRandomArray(size);

        // Display generated random values
        System.out.println("Generated 4-digit random values:");
        for (int num : randomNumbers) {
            System.out.println(num);
        }

        // Find average, min, and max
        double[] result = calculator.findAverageMinMax(randomNumbers);

        // Display results
        System.out.println("\nAverage: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);

        // Close the scanner
        scanner.close();
    }
}
