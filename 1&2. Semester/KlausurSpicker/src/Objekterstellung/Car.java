package Objekterstellung;

public class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public Car() {
        this.brand = "UNKNOWN";
        this.model = "UNKNOWN";
    }
    @Override
    public String toString() {
        return "Car{" + "brand=" + brand + ", model=" + model + '}';
    }
}

