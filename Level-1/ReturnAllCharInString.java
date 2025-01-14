/*Write a program to return all the characters in a string using the user-defined method,  compare the result 
with the String built-in toCharArray() method, and display the result
Hint => 
Take user input using the  Scanner next() method to take the text into a String variable
Write a method to return the characters in a string without using the toCharArray() 
Write a method to compare two string arrays and return a boolean result
In the main() call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, 
and finally display the result
*/
import java.util.*;
public class ReturnAllCharInString{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NAME TO CHECK CHARCATERS ");
		String string=sc.next();
		char[] characterManaully=returnCharater(string);
		char[] tocharArray=string.toCharArray();
		boolean areEqual = compareTwoCharacters(characterManaully, tocharArray);//call 
		System.out.println("Characters using user-defined method: " + new String(characterManaully));
        System.out.println("Characters using toCharArray(): " + new String(tocharArray));
        System.out.println("Are the two arrays equal? " + areEqual);
		
	}
	//strore all characters of string in array
	public static char[] returnCharater(String string){
		char[]character=new char [string.length()];
		for(int i=0;i<string.length();i++){
			character[i]=string.charAt(i);
		}
		return character;
	}
	//to compare both string characters
	public static boolean compareTwoCharacters(char []array1,char[] array2){
		 if (array1.length != array2.length) {
            return false;
        }
		for(int i=0;i<array1.length;i++){
			if(array1[i]==array2[i]){
				return true;
			}
		}
		return false;
	}
		
}
		
		