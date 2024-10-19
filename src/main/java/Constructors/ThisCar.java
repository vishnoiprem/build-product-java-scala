package Constructors;

class Car1 {
    String model;
    int year;

    // Constructor with parameters
    Car1(String model, int year) {
        this.model = model; // 'this' refers to the instance variable
        this.year = year;
    }

    void display() {
        System.out.println("Model: " + this.model + ", Year: " + this.year);
    }
}

public class ThisCar {
    public static void main(String[] args) {
        Car1 car = new Car1("Tesla", 2023); // Corrected to Car1
        car.display();  // Output: Model: Tesla, Year: 2023
    }
}