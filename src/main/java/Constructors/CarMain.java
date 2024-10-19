package Constructors;

// Class with constructors
class Car {
    String model;
    int year;

    // Default constructor
    public Car() {
        this.model = "Unknown";  // Setting default value
        this.year = 2020;        // Setting default value
    }

    // Parameterized constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class CarMain {
    public static void main(String[] args) {
        // Creating objects using constructors
        Car defaultCar = new Car();  // Using default constructor
        Car customCar = new Car("Tesla", 2023);  // Using parameterized constructor

        // Displaying car details
        defaultCar.displayDetails();  // Output: Model: Unknown, Year: 2020
        customCar.displayDetails();   // Output: Model: Tesla, Year: 2023
    }
}