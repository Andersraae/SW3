package Planes;

import java.util.Date;

public abstract class Plane {
    private int planeId;
    private Date departureTime, arrivalTime;
    private String state;

    public Plane(int planeId, Date departureTime, Date arrivaltime, String state) {
        this.planeId = planeId;
        this.departureTime = departureTime;
        this.arrivalTime = arrivaltime;
        this.state = state;
    }

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
