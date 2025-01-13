/*Create a program to find the mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements / number of elements
Create a double array named heights of size 11 and get input values from the user.
Find the sum of all the elements present in the array.
Divide the sum by 11 to find the mean height and print the mean height of the football team*/
import java.util.*;
public class MeanHeight{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double sum=0.0;
		double mean;
		double heights[]=new double [11];
		for(int i=0;i<11;i++){
			System.out.println("Enter Football Player Height");
			heights[i]=sc.nextDouble();//take input from user
		}
		for(int i=0;i<11;i++){
			//to find sum of all player height
			sum+=heights[i];
			
		}
		/*The formula to calculate the mean is: mean = 
		sum of all elements / number of elements*/
		mean=sum/11;
		System.out.println("The mean height of the football team: " + mean);
			
	}	
		

}