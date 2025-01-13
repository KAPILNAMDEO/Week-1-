/*An athlete runs in a triangular park with sides provided as input by the user in meters. 
If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => 
Take user input for 3 sides of a triangle 
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run
*/
import java.util.*;
public class TriangularPark{
	public double roundComplete(double sideFirst,double sideSecond,double sidethird,double distance){
		distance*=1000;
		double perimeter=sideFirst+sideSecond+sidethird;//calculate perimeter
		double roundToComplete=distance/perimeter;
		return roundToComplete;
		
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter km : ");
		double distance=sc.nextInt();//take input
		System.out.println("Enter first side : ");
		double sideFirst=sc.nextInt();//take input
		System.out.println("Enter second side : ");
		double sideSecond=sc.nextInt();//take input
		System.out.println("Enter third side : ");
		double sidethird=sc.nextInt();//take input
		
		TriangularPark triangularPark=new TriangularPark();//Iniatialize objcet
		double roundToComplete = triangularPark.roundComplete(sideFirst,sideSecond,sidethird,distance);//call method
		System.out.println("The number of rounds user needs to do to complete "+ distance+ " km run "+roundToComplete );
		
	}	
}
