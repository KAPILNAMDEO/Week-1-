/*Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number
 and 0 if number is zero
*/
import java.util.*;
public class CheckNumber{
	public int numberCheck(int number){
		//check the number positive,negative or zero
		if(number>0){
			return 1;
		}
		else if(number==0){
			return 0;
		}
		
		else{
			return -1;
		}
		
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number=sc.nextInt();//take input
		
	
		CheckNumber checkNumber=new CheckNumber();//Iniatialize objcet
		int numberToCheck= checkNumber.numberCheck(number);//call method
		System.out.println(numberToCheck);
		
	}	
}