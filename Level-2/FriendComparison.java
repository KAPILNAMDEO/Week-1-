import java.util.Scanner;

public class FriendComparison {

    // Method to find the youngest among the 3 friends
    public static String findYoungest(int[] ages, String[] names) {
        int minAgeIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }
        return names[minAgeIndex];
    }

    // Method to find the tallest among the 3 friends
    public static String findTallest(double[] heights, String[] names) {
        int maxHeightIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }
        return names[maxHeightIndex];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height (in cm) for " + names[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Find and display youngest and tallest
        String youngest = findYoungest(ages, names);
        String tallest = findTallest(heights, names);

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close();
    }
}
