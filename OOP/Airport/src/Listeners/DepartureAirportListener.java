package Listeners;

import AdministatingEntities.Airport;
import AdministatingEntities.Flight;
import AdministatingEntities.FlightStatus;

public class DepartureAirportListener implements FlightListener {

    private Airport airport;

    public DepartureAirportListener(Airport airport) {
        this.airport = airport;
    }

    @Override
    public void flightUpdate(Flight flight) {
        this.airport.displayDepartures();
        if (flight.getStatus() == FlightStatus.IN_FLIGHT){
            this.airport.removePlane(flight.getAssignedPlane());
        }
    }
}
