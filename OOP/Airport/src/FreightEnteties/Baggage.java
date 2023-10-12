package FreightEnteties;

import Planes.Plane;

public class Baggage extends Freight {
    double weight;

    public Baggage(Plane assignedPlane) {
        super(assignedPlane);
    }
}
