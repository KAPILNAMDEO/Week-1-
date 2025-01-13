/*Create a program to save odd and even numbers into odd and even arrays between 1 to the number 
entered by the user. Finally, print the odd and even numbers array
Hint => 
Get an integer input from the user, assign it to a variable number, and check for Natural Number.
 If not a natural number then print an error and exit the program
Create an integer array for even and odd numbers with size = number / 2 + 1
Create index variables for odd and even numbers and initialize them to zero
Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or 
even number into the corresponding array
Finally, print the odd and even numbers array using the odd and even index*/
import java.util.*;
public class OddEvenArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int number=sc.nextInt();
		if(number<=0){
			System.err.println("Error: Input must be a natural number.");
			System.exit(0);
		}
		int arrayEven[]=new int[number/2+1];
		int arrayOdd[]=new int[number/2+1];
		int indexEven=0;
		int indexOdd=0;
		for(int i=1;i<=number;i++){
			if(i%2==0){
				arrayEven[indexEven++]=i;
			}
			else{
				arrayOdd[indexOdd++]=i;
			}
		}
		
		// Print odd numbers array
        System.out.print("Odd numbers: ");
        for (int i = 0; i < indexOdd; i++) {
            System.out.print(arrayOdd[i] + " ");
        }
        System.out.println();

        // Print even numbers array
        System.out.print("Even numbers: ");
        for (int i = 0; i < indexEven; i++) {
            System.out.print(arrayEven[i] + " ");
        }
        System.out.println();

        sc.close();
	}	
}