/*7.Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____*/
public class VolumeOfearth {
    public static void main(String[] args) {
        // Define the radius of Earth in kilometers
        double radiusOfEarth = 6378;

        // Calculate the volume of the Earth in cubic kilometers
        double volumeInKm = (4.0 / 3) * Math.PI * Math.pow(radiusOfEarth, 3);

        // Convert the volume to cubic miles (1 mile = 1.609 kilometers)
        double volumeInMiles = volumeInKm * 0.239913;

        // Print the results
        System.out.println("The volume of Earth in cubic kilometers is " + volumeInKm+" The volume of Earth in cubic miles is " + volumeInMiles);
       
    }
}
