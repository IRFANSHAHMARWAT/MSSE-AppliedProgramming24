package task3;

public class Main {
    public static void main(String[] args) {
        int[] ratings = {8, 3, 9, 2, 7, 5, 9, 2};
        
        QuickSort.sort(ratings, 0, ratings.length - 1);
        
        System.out.print("Sorted: ");
        for (int rating : ratings) {
            System.out.print(rating + " ");
        }
        System.out.println();

        int modeCount = 0;
        int maxCount = 0;
        int[] frequency = new int[11]; // Assuming ratings are between 1 and 10
        
        for (int rating : ratings) {
            frequency[rating]++;
        }

        for (int i = 1; i <= 10; i++) {
            if (frequency[i] > maxCount) {
                maxCount = frequency[i];
                modeCount = 1; // Reset to 1 mode found
            } else if (frequency[i] == maxCount && maxCount > 0) {
                modeCount++;
            }
        }

        System.out.print("Mode: ");
        boolean first = true;
        for (int i = 1; i <= 10; i++) {
            if (frequency[i] == maxCount) {
                if (!first) {
                    System.out.print(" and ");
                }
                System.out.print(i);
                first = false;
            }
        }
        System.out.println();

        int belowFiveCount = 0;
        for (int rating : ratings) {
            if (rating < 5) {
                belowFiveCount++;
            }
        }

        System.out.println("Count Below 5: " + belowFiveCount);

        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        
        System.out.println("Sum of Ratings: " + sum);
    }
}
