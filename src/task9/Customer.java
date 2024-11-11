package task9;

public class Customer {

    private int id;
    private int waitTime; // in minutes

    // Constructor to initialize the customer
    public Customer(int id, int waitTime) {
        this.id = id;
        this.waitTime = waitTime;
    }

    public int getId() {
        return id;
    }

    public int getWaitTime() {
        return waitTime;
    }
}

