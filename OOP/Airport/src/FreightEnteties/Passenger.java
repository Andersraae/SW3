package FreightEnteties;

import Planes.PassengerPlane;
import Planes.Plane;

public class Passenger extends FreightEntity {
    String name;
    PassengerPlane plane;

    public Passenger(Plane assignedPlane) {
        super(assignedPlane);
    }
}
