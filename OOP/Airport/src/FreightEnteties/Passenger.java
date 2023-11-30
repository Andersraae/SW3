package FreightEnteties;

import Planes.PassengerPlane;
import Planes.Plane;

import java.util.Set;

public class Passenger {
    private String name;
    private Set<Baggage> baggages;

    private PassengerPlane assignedPlane;

    public Passenger(String name, PassengerPlane assignedPlane) {
        this.assignedPlane = assignedPlane;
        this.name = name;
    }

    public void addBaggage(Baggage baggage){
        baggages.add(baggage);
    }
}
