package Constructors;

class Car3 {
    static String manufacturer = "Tesla";  // static variable
    String model;  // instance variable

    Car3(String model) {
        this.model = model;
    }
}

public class instancecar {
    public static void main(String[] args) {
        Car3 car1 = new Car3("Model S");
        Car3 car2 = new Car3("Model 3");

        // Static variable (shared among all objects)
        System.out.println(Car3.manufacturer);  // Tesla

        // Instance variables (unique to each object)
        System.out.println(car1.model);  // Model S
        System.out.println(car2.model);  // Model 3
    }
}