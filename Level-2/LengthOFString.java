/*Write a program to find and return the length of a string without using the length() method 
Hint => 
Take user input using the Scanner next() method 
Create a method to find and return a string's length without using the built-in length() method. The logic for this is 
to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the
 exception, and then return the count
The main function calls the user-defined method as well as the built-in length() method and displays the result
*/
import java.util.*;
public class LengthOFString{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String: ");
	//take user input
	String  string=sc.next();
	int stringLengthBuildIn=string.length();
	int stringlengthWithoutBuiltIn=returnLength(string);
	//
	System.out.println("String length without using Build In method: "+stringlengthWithoutBuiltIn);//using build-in
	System.out.println("String length using Build In: "+stringLengthBuildIn);
	//call method to count length without build-in mehtod
	
	
		
	}
	public static int returnLength(String string){
	int count=0;
	try{
		while(true){
			string.charAt(count);
			count++;
		}
	}catch(IndexOutOfBoundsException e){
		System.err.println("Error:Index Out of Bound Exception "+e.getMessage());
	}
	return count;
	
     
	}		
}