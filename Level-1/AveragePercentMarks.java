/*Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___ */
public class AveragePercentMarks{
	public static void main(String args[]){
		String name="Sam's ";
		int mathsMarks=94;
		int physicsMarks=95;
		int chemistryMarks=96;
		int totalMarks=mathsMarks+physicsMarks+chemistryMarks;
		int averageMarks= totalMarks/3;// average marks equal to sum of marks by number of marks
		System.out.println(name+" average mark in PCM is : " + averageMarks);
		}
}
