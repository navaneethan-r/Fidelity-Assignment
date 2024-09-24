abstract class Vehicle {
    private String registrationNumber;
    private String brand;

    public Vehicle(String registrationNumber, String brand) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public abstract double calculateParkingFee(int hours);
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String registrationNumber, String brand, int numDoors) {
        super(registrationNumber, brand);
        this.numDoors = numDoors;
    }

    @Override
    public double calculateParkingFee(int hours) {
        return hours * 2.0;
    }
}


class Motorcycle extends Vehicle {
    private String engineType;

    public Motorcycle(String registrationNumber, String brand, String engineType) {
        super(registrationNumber, brand);
        this.engineType = engineType;
    }

    @Override
    public double calculateParkingFee(int hours) {
        return hours * 1.0;
    }
}

class ParkingLot {
    public void generateBill(Vehicle vehicle, int hours) {
        double fee = vehicle.calculateParkingFee(hours);
        System.out.println("----- Parking Bill -----");
        System.out.println("Vehicle Type: " + vehicle.getClass().getSimpleName());
        System.out.println("Registration Number: " + vehicle.getRegistrationNumber());
        System.out.println("Brand: " + vehicle.getBrand());
        System.out.println("Hours Parked: " + hours);
        System.out.println("Total Parking Fee: $" + fee);
        System.out.println("------------------------");
    }
}

public class Parking {
    public static void main(String[] args) {
        Vehicle car1 = new Car("TN 39 CD 3244", "Audi", 4);
        Vehicle motorcycle1 = new Motorcycle("TN 39 CD 4676", "NS 200", "Liquid-Cooled");
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.generateBill(car1, 5); 
        parkingLot.generateBill(motorcycle1, 3); 
    }
}
