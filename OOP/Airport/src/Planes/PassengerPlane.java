package Planes;

import java.util.Date;

public class PassengerPlane extends Plane {

    private int passengerAmount;

    public PassengerPlane (int planeId, String state, int pasesngerAmount) {
        super(planeId, state);
        this.passengerAmount = pasesngerAmount;
    }



}
