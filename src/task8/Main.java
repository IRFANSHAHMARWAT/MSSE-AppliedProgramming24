package task8;

public class Main {

    public static void main(String[] args) {
        // Create a BrowserHistoryStack with capacity of 10 pages
        BrowserHistoryStack browserHistory = new BrowserHistoryStack(10);

        // Simulate visiting pages
        browserHistory.push("marwattech.com/home");
        browserHistory.push("marwat-tech.com/contact");
        browserHistory.push("fuuast.pk/about");
        browserHistory.push("marwattech.com/blog");

        // Display the most recent and oldest pages
        System.out.println("Recent page: '" + browserHistory.getRecentPage() + "'");
        System.out.println("Oldest page: '" + browserHistory.getOldestPage() + "'");

        // Calculate and display the percentage of pages from "example.com"
        double percentage = browserHistory.calculateDomainPercentage("example.com");
        System.out.println("Percentage of pages visited from 'example.com': " + percentage + "%");

        // Display the total number of pages visited
        System.out.println("Total number of pages visited: " + browserHistory.totalPagesVisited());
        
        // Simulate the back functionality (pop the last visited page)
        browserHistory.pop();
        
        // Display the updated most recent page
        System.out.println("Recent page after going back: '" + browserHistory.getRecentPage() + "'");
    }
}
