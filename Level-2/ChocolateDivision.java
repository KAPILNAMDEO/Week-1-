
/*Create a program to divide N number of chocolates among M children.
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Find the number of chocolates each child gets and number of remaining chocolates
Display the results
I/P => numberOfchocolates, numberOfChildren
O/P => The number of chocolates each child gets is ___ and the number of remaining chocolates are ___*/
import java.util.Scanner;

public class ChocolateDivision {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();
        
        // Calculate chocolates each child gets and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        
        // Display the results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + 
                           " and the number of remaining chocolates are " + remainingChocolates);
    }
}
