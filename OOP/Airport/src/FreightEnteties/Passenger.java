package FreightEnteties;

import Planes.PassengerPlane;
import Planes.Plane;

public class Passenger extends Freight {
    String name;
    PassengerPlane plane;
    Baggage[] baggages;

    public Passenger(String name, Plane assignedPlane) {
        super(assignedPlane);
        this.name = name;
    }
}
