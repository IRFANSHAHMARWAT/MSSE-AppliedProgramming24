package task5;

public class Main {
    public static void main(String[] args) {
        int[] bookCodes = {103, 101, 109, 102, 107};
        
        // Sort the book codes using Insertion Sort
        InsertionSort.sort(bookCodes);
        
        // Display sorted book codes
        System.out.print("Sorted: ");
        for (int code : bookCodes) {
            System.out.print(code + " ");
        }
        System.out.println();

        // Calculate the difference between the highest and lowest codes
        int range = bookCodes[bookCodes.length - 1] - bookCodes[0];
        
        // Check for consecutive book codes
        boolean hasConsecutive = false;
        for (int i = 0; i < bookCodes.length - 1; i++) {
            if (bookCodes[i] + 1 == bookCodes[i + 1]) {
                hasConsecutive = true;
                break;
            }
        }

        // Calculate the number of unique codes
        int uniqueCount = 0;
        for (int i = 0; i < bookCodes.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (bookCodes[i] == bookCodes[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCount++;
            }
        }

        // Output the results
        System.out.println("Range: " + range);
        System.out.println("Consecutive Codes: " + (hasConsecutive ? "Yes" : "No"));
        System.out.println("Unique Codes: " + uniqueCount);
    }
}

