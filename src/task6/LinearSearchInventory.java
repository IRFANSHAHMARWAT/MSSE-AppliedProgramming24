package task6;

public class LinearSearchInventory {

    // Linear Search implementation
    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // Return the index if item is found
            }
        }
        return -1; // Return -1 if item is not found
    }

    // Count how many items have IDs less than the given ID
    public static int countItemsLessThan(int[] arr, int x) {
        int count = 0;
        for (int id : arr) {
            if (id < x) {
                count++;
            }
        }
        return count;
    }

    // Sum of IDs greater than the given ID
    public static int sumItemsGreaterThan(int[] arr, int x) {
        int sum = 0;
        for (int id : arr) {
            if (id > x) {
                sum += id;
            }
        }
        return sum;
    }

    // Find the smallest item ID in the list
    public static int findSmallest(int[] arr) {
        int smallest = arr[0];
        for (int id : arr) {
            if (id < smallest) {
                smallest = id;
            }
        }
        return smallest;
    }
}
