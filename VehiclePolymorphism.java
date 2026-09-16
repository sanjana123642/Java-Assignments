import java.util.Scanner;

class Vehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with push-button ignition.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with self-start.");
    }
}

public class VehiclePolymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle type (Car/Bike): ");
        String type = sc.nextLine();

        Vehicle vehicle;

        if (type.equalsIgnoreCase("Car")) {
            vehicle = new Car();
        } else if (type.equalsIgnoreCase("Bike")) {
            vehicle = new Bike();
        } else {
            System.out.println("Invalid vehicle type.");
            sc.close();
            return;
        }

        vehicle.start();

        sc.close();
    }
}