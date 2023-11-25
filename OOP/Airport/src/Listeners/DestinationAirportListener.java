package Listeners;

import AdministatingEntities.Airport;
import AdministatingEntities.Flight;
import Planes.FlightStatus;

public class DestinationAirportListener implements FlightListener {

    private Airport airport;

    public DestinationAirportListener(Airport airport) {
        this.airport = airport;
    }

    @Override
    public void flightUpdate(Flight flight) {
        this.airport.displayArrivals(flight);
        if (flight.getStatus() == FlightStatus.UNLOADING) {
            this.airport.addPlane(flight.getAssignedPlane());
        }
    }
}
