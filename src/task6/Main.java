package task6;

public class Main {

    public static void main(String[] args) {
        // Inventory of item IDs
        int[] arr = {5, 12, 15, 25, 35, 42, 50};
        int x = 25; // Item ID to search for
        
        // Perform linear search
        int index = LinearSearchInventory.linearSearch(arr, x);
        
        if (index != -1) {
            System.out.println("Item found at index: " + index);
            
            // Calculate number of items with IDs less than found item ID
            int lessThanCount = LinearSearchInventory.countItemsLessThan(arr, x);
            System.out.println("Number of items with IDs less than found item: " + lessThanCount);
            
            // Calculate sum of IDs greater than found item ID
            int sumGreaterThan = LinearSearchInventory.sumItemsGreaterThan(arr, x);
            System.out.println("Sum of IDs greater than found item: " + sumGreaterThan);
            
            // Calculate difference between found item ID and smallest item ID
            int smallestItemID = LinearSearchInventory.findSmallest(arr);
            int difference = x - smallestItemID;
            System.out.println("Difference between found item ID and smallest ID: " + difference);
        } else {
            System.out.println("Item not found in inventory.");
        }
    }
}
