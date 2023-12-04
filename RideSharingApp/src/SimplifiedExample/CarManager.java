package SimplifiedExample;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

    public static List<Car> availableCars = new ArrayList<Car>();

    public static void addAvailableCar(Car car) {
        if(car.getAvailability()){
            availableCars.add(car);
        }
    }

    public static List<Car> getAvailableCars() {
        return availableCars;
    }
}
