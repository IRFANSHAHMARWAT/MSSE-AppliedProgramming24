package task4;

public class ShellSort {
    public static void sort(int[] prices) {
        int n = prices.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = prices[i];
                int j = i;
                while (j >= gap && prices[j - gap] > temp) {
                    prices[j] = prices[j - gap];
                    j -= gap;
                }
                prices[j] = temp;
            }
        }
    }
}

