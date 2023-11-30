import AdministatingEntities.Airport;
import AdministatingEntities.Flight;
import Listeners.DepartureAirportListener;
import Listeners.DestinationAirportListener;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Airport copenhagenAirport = new Airport("Denmark", "Copenhagen", 200);
        Airport tarmAirport = new Airport("Denmark", "Tarm", 2);

        // New flight from Copgenhagen to Tarm
        Plane newplane = new PassengerPlane(2);
        copenhagenAirport.addPlane(newplane);
        Flight cphToTarm = new Flight(
                newplane,
                new Date(2022 - 1900, Calendar.DECEMBER, 24, 18, 30),
                new Date(2022 - 1900, Calendar.DECEMBER, 24, 19, 0),
                tarmAirport
        );
        cphToTarm.addListener(new DepartureAirportListener(copenhagenAirport));
        cphToTarm.addListener(new DestinationAirportListener(tarmAirport));
        newplane.setFlight(cphToTarm);


        // New flight from Tarm to Copenhagen
        Plane anotherPlane = new PassengerPlane(2);
        tarmAirport.addPlane(anotherPlane);
        Date now = new Date();
        Flight tarmToCph = new Flight(
                anotherPlane,
                new Date(now.getTime() + 62_000),
                new Date(now.getTime() + 122_000),
                copenhagenAirport
        );
        tarmToCph.addListener(new DepartureAirportListener(tarmAirport));
        tarmToCph.addListener(new DestinationAirportListener(copenhagenAirport));
        anotherPlane.setFlight(tarmToCph);



        copenhagenAirport.changeDeparture(newplane, new Date(2022 - 1900, Calendar.DECEMBER, 24, 19, 0));

    }
}