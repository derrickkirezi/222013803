// In this work, I made a program that shows functionalities of vehicles 
// I define an interface for drivable vehicles
interface Drivable {
    void drive(); // Method for driving
}

// Class representing a car, implements Drivable interface
class Car implements Drivable {
    @Override
    public void drive() {
        System.out.println("Driving the car");
    }

    public void honk() {
        System.out.println("Honking the car horn");
    }
}

// Class representing a Bicycle, implements Drivable interface
class Bicycle implements Drivable {
    @Override
    public void drive() {
        System.out.println("Pedaling the bicycle");
    }

    public void ringBell() {
        System.out.println("Ringing the bicycle bell");
    }
}

// Class representing a Motorcycle, implements Drivable interface
class Motorcycle implements Drivable {
    @Override
    public void drive() {
        System.out.println("Riding the motorcycle");
    }

    public void revEngine() {
        System.out.println("Revving the motorcycle engine");
    }
}

// Class representing a Truck, implements Drivable interface
class Truck implements Drivable {
    @Override
    public void drive() {
        System.out.println("Driving the truck");
    }

    public void honkHorn() {
        System.out.println("Honking the truck horn");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive(); // Drive the car
        myCar.honk(); // Honk the car horn

        Bicycle myBicycle = new Bicycle();
        myBicycle.drive(); // Pedal the bicycle
        myBicycle.ringBell(); // Ring the bicycle 

        Motorcycle myMotorcycle = new Motorcycle();
        myMotorcycle.drive(); // Ride the motorcycle
        myMotorcycle.revEngine(); // Rev the motorcycle engine

        Truck myTruck = new Truck();
        myTruck.drive(); // Drive the truck
        myTruck.honkHorn(); // Honk the truck horn
    }
}
