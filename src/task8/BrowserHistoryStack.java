package task8;
public class BrowserHistoryStack {

    private String[] history;
    private int top;
    private int capacity;

    // Constructor to initialize the stack with a given capacity
    public BrowserHistoryStack(int capacity) {
        this.capacity = capacity;
        history = new String[capacity];
        top = -1;
    }

    // Push a page URL onto the stack
    public void push(String page) {
        if (top < capacity - 1) {
            history[++top] = page;
            System.out.println("Page '" + page + "' pushed into stack.");
        } else {
            System.out.println("Stack overflow! Cannot add more pages.");
        }
    }

    // Pop a page URL from the stack (back functionality)
    public void pop() {
        if (top >= 0) {
            System.out.println("Page '" + history[top--] + "' popped from stack.");
        } else {
            System.out.println("No pages to go back to.");
        }
    }

    // Get the most recent page (top of the stack)
    public String getRecentPage() {
        if (top >= 0) {
            return history[top];
        } else {
            return "No pages visited yet.";
        }
    }

    // Get the oldest page (bottom of the stack)
    public String getOldestPage() {
        if (top >= 0) {
            return history[0];
        } else {
            return "No pages visited yet.";
        }
    }

    // Calculate the total number of pages visited
    public int totalPagesVisited() {
        return top + 1;
    }

    // Calculate the percentage of pages visited from a specific domain
    public double calculateDomainPercentage(String domain) {
        int domainCount = 0;
        for (int i = 0; i <= top; i++) {
            if (history[i].contains(domain)) {
                domainCount++;
            }
        }
        return (top >= 0) ? (domainCount * 100.0 / (top + 1)) : 0;
    }
}
