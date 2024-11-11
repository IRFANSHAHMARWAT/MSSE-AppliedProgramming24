package task4;

public class Main {
    public static void main(String[] args) {
        int[] prices = {300, 150, 700, 400, 200};
        
        // Calculate average of unsorted prices
        double average = 0;
        for (int price : prices) {
            average += price;
        }
        average /= prices.length;
        
        // Find the price closest to the average
        int closestToAverage = prices[0];
        double minDifference = Math.abs(prices[0] - average);
        
        for (int price : prices) {
            double difference = Math.abs(price - average);
            if (difference < minDifference) {
                minDifference = difference;
                closestToAverage = price;
            }
        }
        
        // Sort the prices using Shell Sort
        ShellSort.sort(prices);
        
        // Display sorted prices
        System.out.print("Sorted: ");
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
        
        // Identify most expensive and least expensive items
        int leastExpensive = prices[0];
        int mostExpensive = prices[prices.length - 1];
        
        // Calculate the percentage increase
        double percentageIncrease = ((double)(mostExpensive - leastExpensive) / leastExpensive) * 100;
        
        // Display results
        System.out.println("Closest to Average: " + closestToAverage);
        System.out.println("Most Expensive: " + mostExpensive);
        System.out.println("Least Expensive: " + leastExpensive);
        System.out.printf("Percentage Increase: %.2f%%\n", percentageIncrease);
    }
}
