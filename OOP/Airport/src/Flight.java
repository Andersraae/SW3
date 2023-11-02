import Planes.Plane;

import java.util.Date;

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

    long getFlightTime(){
        return arrivalTime.getTime() - departureTime.getTime();
    }
}
