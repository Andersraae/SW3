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

        // Add new plane to copenhagen
        copenhagenAirport.addPlane(new PassengerPlane(
                1,
                2));

        for (Plane plane : copenhagenAirport.getPlanes()) {
            if (plane.getPlaneId() == 1) {
                Flight theflitght = new Flight(
                        1,
                        plane,
                        new Date(2022 - 1900, Calendar.DECEMBER, 24, 18, 30),
                        new Date(2022 - 1900, Calendar.DECEMBER, 24, 19, 0),
                        tarmAirport
                );

                theflitght.addListener(new DepartureAirportListener(copenhagenAirport));
                theflitght.addListener(new DestinationAirportListener(tarmAirport));
                plane.setFlight(theflitght);
            }
        }
        for (Plane plane : copenhagenAirport.getPlanes()) {
            System.out.println("Plane in copenhagen airport departs at " + plane.getFlight().getDepartureTime().toString());
        }

        copenhagenAirport.changeDeparture(1, new Date(2022 - 1900, Calendar.DECEMBER, 24, 19, 0));
        for (Plane plane : copenhagenAirport.getPlanes()) {
            System.out.println("Plane in copenhagen airport departs at " + plane.getFlight().getDepartureTime().toString());
            System.out.println("And arrives at " + plane.getFlight().getArrivalTime());
        }
    }
}