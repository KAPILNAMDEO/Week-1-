/*Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for number of students
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
*/
import java.util.*;
public class StudentHandshakes{
	public int findMaxHandshakes(int number){
		int numberOfHandshakes=(number * (number - 1)) / 2;
		return numberOfHandshakes;
		
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Students: ");
		int number=sc.nextInt();//take input
		
		StudentHandshakes studentHandshakes=new StudentHandshakes();//Iniatialize objcet
		int numberOfHandshakes = studentHandshakes.findMaxHandshakes(number);//call method
		System.out.println("The maximum number of handshakes among " + number + " students are : " + numberOfHandshakes );
		
	}	
}