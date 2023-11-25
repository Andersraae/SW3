package Listeners;

import AdministatingEntities.Airport;
import AdministatingEntities.Flight;

public class DepartureAirportListener implements FlightListener {
    private Airport airport;

    public DepartureAirportListener(Airport airport) {
        this.airport = airport;
    }

    @Override
    public void flightUpdate(Flight flight) {
        this.airport.displayDepartures();
    }
}
