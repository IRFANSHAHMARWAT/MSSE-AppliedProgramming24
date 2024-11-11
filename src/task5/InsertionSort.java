package task5;

public class InsertionSort {
    public static void sort(int[] bookCodes) {
        for (int i = 1; i < bookCodes.length; i++) {
            int key = bookCodes[i];
            int j = i - 1;

            while (j >= 0 && bookCodes[j] > key) {
                bookCodes[j + 1] = bookCodes[j];
                j--;
            }
            bookCodes[j + 1] = key;
        }
    }
}
