package Listeners;

import AdministatingEntities.Airport;
import AdministatingEntities.Flight;

public class DestinationAirportListener implements FlightListener {

    private Airport airport;

    public DestinationAirportListener(Airport airport) {
        this.airport = airport;
    }

    @Override
    public void flightUpdate(Flight flight) {
        this.airport.displayArrivals(flight);
    }
}
