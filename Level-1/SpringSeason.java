/*Write a program SpringSeason that takes two int values month and day from the command line and prints 
Its a Spring Season otherwise prints Not a Spring Season. 
Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a
 boolean true or false 
*/
import java.util.*;
public class SpringSeason{
	public boolean seasonToCheck(int month,int day){
		
		// Spring Season is from March 20 to June 20
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return true;
        } else {
            return false;
        }

		
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Month : ");
		int month=sc.nextInt();//take input
		System.out.println("Enter Day : ");
		int day=sc.nextInt();//take input
		
	
		SpringSeason springSeason=new SpringSeason();//Iniatialize objcet
		boolean seasonCheck= springSeason.seasonToCheck(month,day);//call method
		if(seasonCheck){
		    System.out.println("Its a Spring Season");
		}
		else{
			System.out.println("Its a Spring Season");
		}
		
	}	
}