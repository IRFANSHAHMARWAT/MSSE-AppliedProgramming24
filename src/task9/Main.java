package task9;

public class Main {

    public static void main(String[] args) {
        // Create a CustomerQueue with a capacity of 3
        CustomerQueue customerQueue = new CustomerQueue(3);

        // Create and enqueue customers with their wait times
        customerQueue.enqueue(new Customer(1, 10));
        customerQueue.enqueue(new Customer(2, 12));
        customerQueue.enqueue(new Customer(3, 14));

        // Calculate and display the average wait time
        double averageWaitTime = customerQueue.getAverageWaitTime();
        System.out.println("Average wait time: " + String.format("%.2f", averageWaitTime) + " minutes.");

        // Display positions of customers in the queue
        customerQueue.displayQueuePositions();

        // Find and display the longest waiting customer
        Customer longestWaitingCustomer = customerQueue.getLongestWaitingCustomer();
        if (longestWaitingCustomer != null) {
            System.out.println("Longest waiting customer: Customer " + longestWaitingCustomer.getId());
        }

        // Simulate serving the customers
        customerQueue.dequeue();
        customerQueue.dequeue();
        customerQueue.dequeue();
    }
}
