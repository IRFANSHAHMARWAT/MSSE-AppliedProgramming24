package task10;

public class PassengerQueue {

    private int[] queue;
    private int front, rear, size, capacity;
    private int totalTicketsSold = 0;
    private int cancellations = 0;

    // Constructor to initialize the queue with a given capacity
    public PassengerQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Add a passenger to the queue (book a ticket)
    public void bookTicket(int passengerId) {
        if (size < capacity) {
            rear = (rear + 1) % capacity;
            queue[rear] = passengerId;
            size++;
            totalTicketsSold++;
            System.out.println("Passenger " + passengerId + " booked a ticket.");
        } else {
            System.out.println("No seats available. Booking failed for Passenger " + passengerId + ".");
        }
    }

    // Remove a passenger from the queue (cancel a booking)
    public void cancelTicket() {
        if (size > 0) {
            int cancelledPassenger = queue[front];
            front = (front + 1) % capacity;
            size--;
            cancellations++;
            System.out.println("Passenger " + cancelledPassenger + " cancelled their ticket.");
        } else {
            System.out.println("No passengers to cancel.");
        }
    }

    // Calculate and return the total tickets sold
    public int getTotalTicketsSold() {
        return totalTicketsSold;
    }

    // Calculate and return the number of cancellations
    public int getCancellations() {
        return cancellations;
    }

    // Calculate and return the number of available seats
    public int getAvailableSeats() {
        return capacity - size;
    }
}
