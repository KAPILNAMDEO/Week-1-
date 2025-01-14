import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println("Attempting to access an index beyond the array length...");
        System.out.println("Name: " + names[names.length]); // This will throw the exception
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            System.out.println("Attempting to access an index beyond the array length...");
            System.out.println("Name: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
            System.out.println("Please ensure the index is within the valid range.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Call method to generate the exception
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in generateException method: " + e.getMessage());
        }

        System.out.println("\nHandling the exception properly now...");

        // Call method to handle the exception
        handleException(names);

        scanner.close();
    }
}
