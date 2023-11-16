package Planes;

import java.util.Date;

public class PassengerPlane extends Plane {

    private int passengerAmount;

    public PassengerPlane(int planeId, int passengerAmount) {
        super(planeId);
        this.passengerAmount = passengerAmount;
    }
}
