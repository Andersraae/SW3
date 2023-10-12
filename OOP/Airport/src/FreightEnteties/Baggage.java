package FreightEnteties;

import Planes.Plane;

public class Baggage extends Freight {
    double weight;
    Passenger owner;

    public Baggage(Plane assignedPlane, Passenger owner) {
        super(assignedPlane);
        this.owner = owner;
    }
}
