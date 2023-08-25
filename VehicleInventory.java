import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {

    protected String make;
    protected String model;
    protected int year;
    protected int price;

    public Vehicle(String make, String model, int year, int price) 
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public abstract void displayDetails();
}

class Car extends Vehicle {

    private int numDoors;
    private String fuelType;

    public Car(String make, String model, int year, int price, int numDoors, String fuelType) 
    {
        super(make, model, year, price);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: Rs. " + price);
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("------------------");
    }

    public double calculateMileage() {
        return 0;
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    private int engineCapacity;

    public Motorcycle(String make, String model, int year, int price, boolean hasSidecar, int engineCapacity) {
        super(make, model, year, price);
        this.hasSidecar = hasSidecar;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void displayDetails() 
    {
        System.out.println("Motorcycle Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: Rs. " + price);
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
        System.out.println("Engine Capacity: " + engineCapacity);
        System.out.println();
    }

    public double calculateSpeed() 
    {
        return 0;
    }
}

public class VehicleInventory {
    public static void main(String[] args) {
        List<Vehicle> inventory = new ArrayList<>();

        inventory.add(new Car("Chevrolet", "Cruze", 2023, 1000000, 4, "Petrol"));
        inventory.add(new Motorcycle("Yamaha", "GSX", 2023, 99000, false, 700));

        for (Vehicle vehicle : inventory) 
        {
            vehicle.displayDetails();
        }
    }
}
