package Planes;

import AdministatingEntities.Flight;
import FreightEnteties.Passenger;

import java.util.Set;

public class PassengerPlane extends Plane {

    private int passengerCapacity;

    private Set<Passenger> passengers;

    public PassengerPlane(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void addPassenger(Passenger passenger){
        if (passengers.size() > passengerCapacity){
            passengers.add(passenger);
        }
    }
}
