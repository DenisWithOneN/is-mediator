package FirstExample;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> availableCars = new ArrayList<>();

        Car car = new Car();
        car.setLocation(25);
        car.setAvailability(true);

        Car car2 = new Car();
        car2.setLocation(39);
        car2.setAvailability(true);

        ClientLogged client = new ClientLogged();
        client.setLocation(30);

        Mediator mediator = new Mediator();
        mediator.calculateVehicleDistance(client, availableCars);

    }

}

