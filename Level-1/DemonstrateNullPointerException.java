/*Write a program to demonstrate NullPointerException. 
Hint => 
Write a Method to generate the Exception. Here define the variable text and initialize it to null. Then call one of the
 String Method to generate the exception
Write the Method to demonstrate NullPointerException. Here define the variable text and initialize it to null. Then 
write try catch block for handling the Exception while accessing one of the String method
From the main Firstly call the method to generate the Exception then refactor the code to call the method to handle 
the RuntimeException
*/
public class DemonstrateNullPointerException {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        // This will throw a NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;
        try {
            // Attempting to call a method on a null object
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Generating exception...");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException in main: " + e.getMessage());
        }

        System.out.println("\nHandling exception...");
        handleException();
    }
}
