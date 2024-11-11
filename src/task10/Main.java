package task10;

public class Main {

    public static void main(String[] args) {
        // Initialize the queue with a capacity of 5 seats
        PassengerQueue passengerQueue = new PassengerQueue(5);

        // Simulate ticket bookings
        passengerQueue.bookTicket(1);
        passengerQueue.bookTicket(2);
        passengerQueue.bookTicket(3);

        // Simulate a ticket cancellation
        passengerQueue.cancelTicket();

        // Simulate more ticket bookings
        passengerQueue.bookTicket(4);
        passengerQueue.bookTicket(5);

        // Display the total tickets sold, cancellations, and available seats
        System.out.println("Total tickets sold: " + passengerQueue.getTotalTicketsSold());
        System.out.println("Total cancellations: " + passengerQueue.getCancellations());
        System.out.println("Available seats: " + passengerQueue.getAvailableSeats());
    }
}

