import Planes.Flight;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Airport copenhagenAirport = new Airport("Denmark", "Copenhagen", 200);
        Airport tarmAirport = new Airport("Denmark", "Tarm", 2);
        Date lastChristmas = new Date(2022 - 1900, Calendar.DECEMBER, 24, 18, 30);
        Date today = new Date();
        System.out.println(lastChristmas + " I gave you ");
        System.out.println(today + " Is today");
        System.out.println("Difference " + TimeUnit.HOURS.convert(today.getTime()-lastChristmas.getTime(), TimeUnit.MILLISECONDS));

        copenhagenAirport.addPlane(new PassengerPlane(
                1,
                "Awaiting",
                2));
        for (Plane plane: copenhagenAirport.getPlanes()){
            if (plane.getPlaneId() == 1){
                plane.setFlight(new Flight(
                        1,
                        plane,
                        new Date(2022 - 1900, Calendar.DECEMBER, 24, 18, 30),
                        new Date(2022 - 1900, Calendar.DECEMBER, 24, 19, 0))
                        );
            }
        }
        for (Plane plane: copenhagenAirport.getPlanes()){
            System.out.println("Plane in copenhagen airport departs at " + plane.getFlight().getDepartureTime().toString());
        }
        copenhagenAirport.changeDeparture(1, new Date(2022 - 1900, Calendar.DECEMBER, 24, 19, 0));
        for (Plane plane: copenhagenAirport.getPlanes()){
            System.out.println("Plane in copenhagen airport departs at " + plane.getFlight().getDepartureTime().toString());
            System.out.println("And arrives at " + plane.getFlight().getArrivalTime());
        }

    }
}