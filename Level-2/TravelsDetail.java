import java.util.Scanner;

public class TravelsDetail {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Take user inputs for name, fromCity, viaCity, and toCity
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter the starting city (fromCity): ");
        String fromCity = scanner.nextLine();
        
        System.out.print("Enter the city you will pass through (viaCity): ");
        String viaCity = scanner.nextLine();
        
        System.out.print("Enter the destination city (toCity): ");
        String toCity = scanner.nextLine();
        
        // Take user inputs for distances
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in km: ");
        double fromToVia = scanner.nextDouble();
        
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in km: ");
        double viaToFinalCity = scanner.nextDouble();
        
        // Take user input for time taken in minutes
        System.out.print("Enter the first time taken for the journey (in minutes): ");
        double firstTime = scanner.nextDouble();
		
		System.out.print("Enter the  second time taken for the journey (in minutes): ");
        double secondTime = scanner.nextDouble();
        double totalTime=firstTime+secondTime;
        // Calculate total distance
        double totalDistance = fromToVia + viaToFinalCity;
        
        // Display the travel details
        System.out.println("\nTravel Details:");
        System.out.println("The Total Distance travelled by " + name + " from " + 
                           fromCity + " to " + toCity + " via " + viaCity + 
                           " is " + totalDistance + " km and " + 
                           "the Total Time taken is " + totalTime + " minutes.");
    }
}

