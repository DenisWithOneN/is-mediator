package FirstExample;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    public List<Integer> calculateVehicleDistance(ClientLogged client, List<Car> cars) {
        List<Integer> distances = new ArrayList<>();

        for (Car car : cars) {
            // Calculate the distance between the car and the client
            int distance = Math.abs(car.getLocation() - client.getLocation());
            distances.add(distance);
        }

        return distances;
    }

}
