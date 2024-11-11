package task2;

public class main {
	    public static void main(String[] args) {
	        int[] scores = {45, 78, 92, 68, 88};
	        
	        double average = 0;
	        for (int score : scores) {
	            average += score;
	        }
	        average /= scores.length;
	        
	        SelectionSort.sort(scores);
	        
	        System.out.print("Sorted: ");
	        for (int score : scores) {
	            System.out.print(score + " ");
	        }
	        System.out.println();
	        
	        System.out.print("Top 3 Scores: ");
	        for (int i = scores.length - 3; i < scores.length; i++) {
	            System.out.print(scores[i] + (i == scores.length - 1 ? "" : ", "));
	        }
	        System.out.println();
	        
	        double variance = 0;
	        for (int score : scores) {
	            variance += Math.pow(score - average, 2);
	        }
	        variance /= scores.length;
	        double standardDeviation = Math.sqrt(variance);
	        
	        System.out.printf("Standard Deviation: %.2f\n", standardDeviation);
	        
	        int aboveAverageCount = 0;
	        for (int score : scores) {
	            if (score > average) {
	                aboveAverageCount++;
	            }
	        }
	        
	        System.out.println("Students Above Average: " + aboveAverageCount);
	    }
	}

