package task3;

public class QuickSort {
    public static void sort(int[] ratings, int low, int high) {
        if (low < high) {
            int pi = partition(ratings, low, high);
            sort(ratings, low, pi - 1);
            sort(ratings, pi + 1, high);
        }
    }

    private static int partition(int[] ratings, int low, int high) {
        int pivot = ratings[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (ratings[j] <= pivot) {
                i++;
                int temp = ratings[i];
                ratings[i] = ratings[j];
                ratings[j] = temp;
            }
        }

        int temp = ratings[i + 1];
        ratings[i + 1] = ratings[high];
        ratings[high] = temp;

        return i + 1;
    }
}
