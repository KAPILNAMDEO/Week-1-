/*12.Write a program that takes the base and height to find area of a triangle in square 
inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___*/
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
        float base = sc.nextFloat();
		float height=sc.nextFloat();
		double areaOfTriangle=0.5 *base * height;
		System.out.println("The area triangle whoose base "+base+ " and "+" height "+height+" is "+areaOfTriangle);
	}
}
