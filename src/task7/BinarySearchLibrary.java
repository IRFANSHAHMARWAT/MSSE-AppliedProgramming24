package task7;

public class BinarySearchLibrary {

    // Binary Search implementation
    public static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (arr[mid] == x) {
                return mid; // Return the index if item is found
            }
            // If x is greater, ignore the left half
            if (arr[mid] < x) {
                low = mid + 1;
            }
            // If x is smaller, ignore the right half
            else {
                high = mid - 1;
            }
        }

        return -1; // Return -1 if item is not found
    }

    // Calculate sum of IDs less than the found book's ID
    public static int sumOfIDsLessThan(int[] arr, int x) {
        int sum = 0;
        for (int id : arr) {
            if (id < x) {
                sum += id;
            }
        }
        return sum;
    }

    // Calculate product of IDs at even positions after found book's ID
    public static int productOfEvenPositionIDsAfterFound(int[] arr, int index) {
        int product = 1;
        // Start from the next element of the found book, and consider only even positions
        for (int i = index + 2; i < arr.length; i += 2) {
            product *= arr[i];
        }
        return product;
    }

    // Calculate the absolute difference between found book's ID and the highest book ID
    public static int absoluteDifferenceWithHighest(int[] arr, int x) {
        int highestID = arr[arr.length - 1]; // Last element in a sorted array
        return Math.abs(x - highestID);
    }
}
