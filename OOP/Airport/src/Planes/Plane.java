package Planes;

import AdministatingEntities.Flight;

public abstract class Plane {
    private final int planeId;
    private Flight flight;

    public Plane(int planeId) {
        this.planeId = planeId;
    }

    public int getPlaneId() {
        return planeId;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }
}
