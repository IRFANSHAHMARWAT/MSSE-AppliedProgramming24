package Task1;

public class Main {
    public static void main(String[] args) {
        int[] scores = {35, 12, 89, 42, 22, 99};
        
        double average = 0;
        for (int score : scores) {
            average += score;
        }
        average /= scores.length;
        
        BubbleSort.sort(scores);
        
        System.out.print("Sorted: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        
        double median = (scores.length % 2 == 0) 
            ? (scores[scores.length / 2 - 1] + scores[scores.length / 2]) / 2.0
            : scores[scores.length / 2];
        
        int range = scores[scores.length - 1] - scores[0];
        
        System.out.printf("Average (Unsorted): %.2f\n", average);
        System.out.printf("Median (Sorted): %.1f\n", median);
        System.out.println("Range (Sorted): " + range);
    }
}
