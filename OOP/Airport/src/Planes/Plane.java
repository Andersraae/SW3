package Planes;

import java.util.Date;

public abstract class Plane {
    int planeId;
    Date departureTime, arrivalTime;
    String state;

    public int getPlaneId() {
        return planeId;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public String getState() {
        return state;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setState(String state) {
        this.state = state;
    }
}
