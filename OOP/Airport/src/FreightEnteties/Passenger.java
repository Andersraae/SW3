package FreightEnteties;

import Planes.PassengerPlane;
import Planes.Plane;

public class Passenger extends Freight {
    String name;
    PassengerPlane plane;

    public Passenger(Plane assignedPlane) {
        super(assignedPlane);
    }
}
