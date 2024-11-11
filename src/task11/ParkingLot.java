package task11;

public class ParkingLot {

    private String[] deque;
    private int front, rear, size, capacity;

    // Constructor to initialize the parking lot with a given capacity
    public ParkingLot(int capacity) {
        this.capacity = capacity;
        deque = new String[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    // Park a car at the rear
    public void parkAtRear(String car) {
        if (isFull()) {
            System.out.println("Parking lot is full. Cannot park " + car + " at rear.");
            return;
        }
        rear = (rear + 1) % capacity;
        deque[rear] = car;
        if (front == -1) front = rear; // Initial setup when parking the first car
        size++;
        System.out.println("Car " + car + " parked at rear.");
    }

    // Park a car at the front
    public void parkAtFront(String car) {
        if (isFull()) {
            System.out.println("Parking lot is full. Cannot park " + car + " at front.");
            return;
        }
        front = (front - 1 + capacity) % capacity;
        deque[front] = car;
        if (rear == -1) rear = front; // Initial setup when parking the first car
        size++;
        System.out.println("Car " + car + " parked at front.");
    }

    // Remove a car from the front
    public void removeFromFront() {
        if (isEmpty()) {
            System.out.println("Parking lot is empty. No car to remove from front.");
            return;
        }
        System.out.println("Car " + deque[front] + " removed from front.");
        front = (front + 1) % capacity;
        size--;
    }

    // Remove a car from the rear
    public void removeFromRear() {
        if (isEmpty()) {
            System.out.println("Parking lot is empty. No car to remove from rear.");
            return;
        }
        System.out.println("Car " + deque[rear] + " removed from rear.");
        rear = (rear - 1 + capacity) % capacity;
        size--;
    }

    // Get the total number of cars parked
    public int getTotalCarsParked() {
        return size;
    }

    // Get the car at the front
    public String getFrontCar() {
        return isEmpty() ? "No car at front" : deque[front];
    }

    // Get the car at the rear
    public String getRearCar() {
        return isEmpty() ? "No car at rear" : deque[rear];
    }

    // Check if the parking lot is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the parking lot is empty
    public boolean isEmpty() {
        return size == 0;
    }
}
