package FirstExample;

import java.util.ArrayList;
import java.util.List;

public class Car implements Vehicle {

    private int location;
    private boolean availability;

    //declaram static pentru a le folosi class-wide
    public static List<Car> availableCars= new ArrayList<>();

    public int getLocation() {
        return location;
    }

    public static List<Car> getAvailableCars() {
        return availableCars;
    }

    @Override
    public void setLocation(int location) {
        this.location = location;
    }

    @Override
    public void setAvailability(boolean availability) {
        this.availability = availability;

        if(availability){
            availableCars.add(this);
        }
    }

    //declaram static pentru a le folosi class-wide si nu instance only
    public static void displayAvailableCars() {
        for(FirstExample.Car car : availableCars) {
            System.out.println("Location " + car.getLocation() + " availability " + car.availability);
        }
    }

}
