package FreightEnteties;

import Planes.Plane;

public class Baggage extends Freight {
    private double weight;
    private Passenger owner;

    public Baggage(Plane assignedPlane, Passenger owner) {
        super(assignedPlane);
        this.owner = owner;
    }
}
