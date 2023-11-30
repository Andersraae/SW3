package Planes;

import AdministatingEntities.Flight;

public abstract class Plane {
    private Flight flight;

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }
}
