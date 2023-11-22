package Planes;

import java.util.Date;
import java.util.Set;

public class Flight {

    private int flightId;

    private Plane assignedPlane;

    private Date departureTime, arrivalTime;

    public Flight(int flightId, Plane assignedPlane, Date departureTime, Date arrivalTime) {
        this.flightId = flightId;
        this.assignedPlane = assignedPlane;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }


    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    long getFlightTime(){
        return arrivalTime.getTime() - departureTime.getTime();
    }
}
