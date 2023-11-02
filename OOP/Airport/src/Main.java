import Planes.PassengerPlane;
import Planes.Plane;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Airport copenhagenAirport = new Airport("Denmark", "Copenhagen", 200);
        Airport tarmAirport = new Airport("Denmark", "Tarm", 2);

        copenhagenAirport.addPlane(new PassengerPlane());
    }
}