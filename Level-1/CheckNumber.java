
/*Write a program to take user input for 5 numbers and check whether a number is positive,
  negative, or zero. Further for positive numbers check if the number is even or odd. Finally
  compare the first and last elements of the array and display if they equal, greater or less
Hint => 
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero. 
Finally compare the first and last element of the array and display if they equal, greater or less*/
import java.util.*;
public class CheckNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		int n=5;
		int arr[]=new int [n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the number to check");
			
			arr[i]=sc.nextInt();//taking the user input in an array
		}
		for(int i=0;i<n;i++){
			if(arr[i]>0){ //check number positive or not
				if(arr[i]%2==0){
				System.out.println("Even number: "+arr[i]);//if postive check even and odd number
				    }
				else{
				System.out.println("Odd number: "+arr[i]);
				}
					
			}
		    if(arr[i]<0){
				System.out.println("The number is negative");
			}
			else if(arr[i]==0){
				System.out.println("The number is zero ");
				
			}
			
			
			
			
		}
		if(arr[0]==arr[n-1]){//check first element and last element equal or not
			System.out.println("Array first and last Element are Equal ");
		}
		else if(arr[0]>arr[n-1]){
			System.out.println("Array first element is greater than last element ");
			
		}
		else{
			System.out.println("Array first element is less than last element ");
			
		}
		
	}
}
		