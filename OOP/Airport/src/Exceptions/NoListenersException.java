package Exceptions;

import AdministatingEntities.Flight;

public class NoListenersException extends Exception {

    private Flight flight;

    public NoListenersException (Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }
}
