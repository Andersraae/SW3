package FreightEnteties;

import Planes.Plane;

public class Baggage {
    private double weight;
    private Passenger owner;
    private Plane assignedPlane;

    public Baggage(Plane assignedPlane, Passenger owner) {
        this.assignedPlane = assignedPlane;
        this.owner = owner;
    }
}
