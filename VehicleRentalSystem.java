
class Vehicle {

    private String brand;
    private String model;
    private int year;
    private double rentalPrice;

    public Vehicle(String brand, String model, int year, double rentalPrice) 
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.rentalPrice = rentalPrice;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void displayVehicleInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Rental Price: Rs. " + rentalPrice);
    }
}

class Car extends Vehicle {

    private int numberOfSeats;

    public Car(String brand, String model, int year, double rentalPrice, int numberOfSeats) 
    {
        super(brand, model, year, rentalPrice);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() 
    {
        return numberOfSeats;
    }
}

class Motorcycle extends Vehicle {

    private int engineCapacity;

    public Motorcycle(String brand, String model, int year, double rentalPrice, int engineCapacity) 
    {
        super(brand, model, year, rentalPrice);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Mustang", 2023, 4000.0, 4);
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja 650", 2023, 400.0, 650);

        car.displayVehicleInfo();
        System.out.println("Number of Seats: " + car.getNumberOfSeats());

        System.out.println("----------------");

        motorcycle.displayVehicleInfo();
        System.out.println("Engine Capacity: " + motorcycle.getEngineCapacity());
    }
}

