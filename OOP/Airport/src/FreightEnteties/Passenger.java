package FreightEnteties;

import Planes.PassengerPlane;
import Planes.Plane;

import java.util.Set;

public class Passenger {
    private String name;
    private PassengerPlane plane;
    private Set<Baggage> baggages;

    private Plane assignedPlane;

    public Passenger(String name, Plane assignedPlane) {
        this.assignedPlane = assignedPlane;
        this.name = name;
    }

    public void addBaggage(Baggage baggage){
        baggages.add(baggage);
    }
}
