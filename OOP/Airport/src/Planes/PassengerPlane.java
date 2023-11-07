package Planes;

import java.util.Date;

public class PassengerPlane extends Plane {

    private int passengerAmount;

    public PassengerPlane (int planeId, Date departureTime, Date arrivaltime, String state, int pasesngerAmount) {
        super(planeId, departureTime, arrivaltime, state);
        this.passengerAmount = pasesngerAmount;
    }

}
