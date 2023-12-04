package SimplifiedExample;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private int carID;
    private int location;
    private boolean available;


    public Car(int carID, int location) {
        this.carID = carID;
        this.location = location;
    }

    public int getCarID() {
        return carID;
    }

    public int getLocation() {
        return location;
    }

    public void setAvailability(boolean available) {
        this.available = available;
    }

    public boolean getAvailability() {
        return available;
    }

}
