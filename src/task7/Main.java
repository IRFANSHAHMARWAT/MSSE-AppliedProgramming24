package task7;

public class Main {

    public static void main(String[] args) {
        // Book IDs in the library (sorted)
        int[] arr = {2, 7, 15, 25, 36, 47, 60};
        int x = 25; // Book ID to search for
        
        // Perform binary search
        int index = BinarySearchLibrary.binarySearch(arr, x);
        
        if (index != -1) {
            System.out.println("Book found at index: " + index);
            
            // Calculate sum of IDs less than found book ID
            int sumLessThan = BinarySearchLibrary.sumOfIDsLessThan(arr, x);
            System.out.println("Sum of IDs less than found book ID: " + sumLessThan);
            
            // Calculate product of IDs at even positions after the found book
            int productAfterEvenPositions = BinarySearchLibrary.productOfEvenPositionIDsAfterFound(arr, index);
            System.out.println("Product of IDs at even positions after found book: " + productAfterEvenPositions);
            
            // Calculate absolute difference between found book ID and highest book ID
            int differenceWithHighest = BinarySearchLibrary.absoluteDifferenceWithHighest(arr, x);
            System.out.println("Difference between found book ID and highest book ID: " + differenceWithHighest);
        } else {
            System.out.println("Book not found in the library.");
        }
    }
}
