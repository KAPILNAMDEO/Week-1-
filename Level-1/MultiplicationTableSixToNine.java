/*Create a program to find the multiplication table of a number entered by the user from 6 to 9 and 
display the result
Hint => 
Take integer input and store it in the variable number as well as define an integer array to store the
 multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___*/

import java.util.*;
public class MultiplicationTableSixToNine{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for table creation: ");
		int number=sc.nextInt(); //take input from user
		int array[]=new int [10];
		
		for(int i=6;i<=9;i++){//take range from 6 to 9
			array[i]=number*(i);
			System.out.println(number+" * " + (i) + " = " + array[i]);
		}
	
		
	}
	
}
