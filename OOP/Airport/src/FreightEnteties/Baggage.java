package FreightEnteties;

import Planes.Plane;

public class Baggage extends FreightEntity {
    double weight;

    public Baggage(Plane assignedPlane) {
        super(assignedPlane);
    }
}
