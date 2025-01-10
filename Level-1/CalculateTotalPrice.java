/*Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___*/

import java.util.Scanner;

public class CalculateTotalPrice {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input unit price
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = sc.nextDouble();

        // Prompt the user to input quantity
        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.printf("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice) ;
    }
}
