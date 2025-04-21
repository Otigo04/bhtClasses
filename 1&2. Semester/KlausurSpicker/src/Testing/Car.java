import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Car implements Serializable {

    private static final long serialVersionUID = 18L;

    private String name;
    private transient int mileage = 0;

    

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMileage() {
        return mileage;
    }

    public void drive(int amount) {
        this.mileage += amount;
    }
}