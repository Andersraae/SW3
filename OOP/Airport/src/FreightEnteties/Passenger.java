package FreightEnteties;

import Planes.PassengerPlane;
import Planes.Plane;

import java.util.List;
import java.util.Set;

public class Passenger extends Freight {
    private String name;
    private PassengerPlane plane;
    private Set<Baggage> baggages;

    public Passenger(String name, Plane assignedPlane) {
        super(assignedPlane);
        this.name = name;
    }

    public void addBaggage(Baggage baggage){
        baggages.add(baggage);
    }
}
