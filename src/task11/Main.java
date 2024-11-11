package task11;

public class Main {

    public static void main(String[] args) {
        // Initialize the parking lot with a capacity of 3 cars
        ParkingLot parkingLot = new ParkingLot(3);

        // Simulate parking cars
        parkingLot.parkAtRear("Car A");
        parkingLot.parkAtFront("Car B");

        // Display total cars parked and the front/rear cars
        System.out.println("Total cars parked: " + parkingLot.getTotalCarsParked());
        System.out.println("Front car: " + parkingLot.getFrontCar());
        System.out.println("Rear car: " + parkingLot.getRearCar());

        // Check if the parking lot is full or empty
        System.out.println("Parking lot full: " + (parkingLot.isFull() ? "Yes" : "No"));

        // Simulate removing cars
        parkingLot.removeFromFront();
        parkingLot.parkAtRear("Car C");

        // Final state
        System.out.println("Total cars parked: " + parkingLot.getTotalCarsParked());
        System.out.println("Parking lot full: " + (parkingLot.isFull() ? "Yes" : "No"));
    }
}
