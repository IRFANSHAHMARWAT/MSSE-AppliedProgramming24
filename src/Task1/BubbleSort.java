package Task1;

public class BubbleSort {
public static void sort(int[] scores) {
		// TODO Auto-generated method stub
		  for (int i = 0; i < scores.length - 1; i++) {
	            for (int j = 0; j < scores.length - i - 1; j++) {
	                if (scores[j] > scores[j + 1]) {
	                    int temp = scores[j];
	                    scores[j] = scores[j + 1];
	                    scores[j + 1] = temp;
	                }
	            }
	        }
	    
	}
}
