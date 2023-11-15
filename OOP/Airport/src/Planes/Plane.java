package Planes;

import java.util.Date;


public abstract class Plane {
    private final int planeId;
    private String state;
    private Flight flight;

    public Plane(int planeId, String state) {
        this.planeId = planeId;
        this.state = state;
    }

    public int getPlaneId() {
        return planeId;
    }

    public String getState() {
        return state;
    }


    public void setState(String state) {
        this.state = state;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }
}
