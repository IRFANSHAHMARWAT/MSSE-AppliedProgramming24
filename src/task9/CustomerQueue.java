package task9;

public class CustomerQueue {

    private Customer[] queue;
    private int front, rear, size, capacity;

    // Constructor to initialize the queue with a given capacity
    public CustomerQueue(int capacity) {
        this.capacity = capacity;
        queue = new Customer[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Add a customer to the queue
    public void enqueue(Customer customer) {
        if (size < capacity) {
            rear = (rear + 1) % capacity;
            queue[rear] = customer;
            size++;
            System.out.println("Customer " + customer.getId() + " entered the queue, having wait time of " + customer.getWaitTime() + " minutes.");
        } else {
            System.out.println("Queue is full. Cannot add more customers.");
        }
    }

    // Remove a customer from the queue (serve them)
    public void dequeue() {
        if (size > 0) {
            System.out.println("Customer " + queue[front].getId() + " served.");
            front = (front + 1) % capacity;
            size--;
        } else {
            System.out.println("Queue is empty. No customer to serve.");
        }
    }

    // Calculate the average wait time of the queue
    public double getAverageWaitTime() {
        if (size == 0) {
            return 0.0;
        }

        double totalWaitTime = 0;
        for (int i = 0; i < size; i++) {
            totalWaitTime += queue[(front + i) % capacity].getWaitTime();
        }
        return totalWaitTime / size;
    }

    // Display the position of each customer in the queue
    public void displayQueuePositions() {
        for (int i = 0; i < size; i++) {
            Customer customer = queue[(front + i) % capacity];
            String position = (i == 0) ? "Front" : "Position " + (i + 1);
            System.out.println("Customer " + customer.getId() + "'s position: " + position);
        }
    }

    // Find the customer who has been waiting the longest
    public Customer getLongestWaitingCustomer() {
        if (size == 0) {
            return null;
        }

        return queue[front]; // Customer at the front has been waiting the longest
    }
}
