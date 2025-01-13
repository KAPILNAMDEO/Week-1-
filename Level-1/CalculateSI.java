/*Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => 
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___
*/
import java.util.*;
public class CalculateSI{
	public double findSimpleInterest(double principle,double rate,double time){
		double simpleInterest=principle*rate*time;
		return simpleInterest;
		
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle: ");
		double principle=sc.nextDouble();//take input
		System.out.println("Enter rate: ");
		double rate=sc.nextDouble();
		System.out.println("Enter time: ");
		double time=sc.nextDouble();
		CalculateSI calculateSI=new CalculateSI();//iniatialize objcet
		double simpleInterest = calculateSI.findSimpleInterest(principle,rate,time);//cal method
		System.out.println("The Simple Interest is "+simpleInterest+ " for principle "+principle+" ,Rate of Interest "+rate+" and Time"+time );
		
	}	
}