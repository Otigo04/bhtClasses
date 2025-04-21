package Objekterstellung;

public class ObjectCreationExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota", "Corolla");

        System.out.println(car1);
        System.out.println(car2);
    }
}
