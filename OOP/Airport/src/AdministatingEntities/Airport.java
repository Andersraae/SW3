package AdministatingEntities;

import Planes.FlightStatus;
import Planes.Plane;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Airport {

    private final int FRAME_WIDTH = 137;

    private Set<Plane> planes;
    private String country, city;
    private int planeCapacity;

    public Airport(String country, String city, int planeCapacity) {
        this.country = country;
        this.city = city;
        this.planeCapacity = planeCapacity;
        this.planes = HashSet.newHashSet(planeCapacity);
    }

    // DISPLAY

    public void displayArrivals(Flight updatedFlight) {
        this.makeFrame("Arrivals");
        HashSet<Plane> planes = new HashSet<>(this.getPlanes());
        planes.add(updatedFlight.getAssignedPlane());

        for (Plane plane : planes) {
            Flight flight = plane.getFlight();

            if (flight.getStatus() == FlightStatus.IN_FLIGHT || flight.getStatus() == FlightStatus.UNLOADING) {
                System.out.printf("| Flight Status: %-4s | Departure: %-8s | Arrival: %-8s | Destination: %-15s |%n",
                        flight.getStatus(), flight.getDepartureTime(), flight.getArrivalTime(), flight.getDestination().getCity());
                System.out.println("+" + "-".repeat(FRAME_WIDTH) + "+");
            }
        }
    }

    public void displayDepartures() {
        this.makeFrame("Departures");
        for (Plane plane : this.getPlanes()) {
            Flight flight = plane.getFlight();
            if (flight.getStatus() == FlightStatus.LOADING) {
                System.out.printf("| Flight Status: %-4s | Departure: %-8s | Arrival: %-8s | Destination: %-15s |%n",
                        flight.getStatus(), flight.getDepartureTime(), flight.getArrivalTime(), flight.getDestination().getCity());
                System.out.println("+" + "-".repeat(FRAME_WIDTH) + "+");
            }
        }
    }

    private void makeFrame(String title) {
        System.out.println("+" + "-".repeat(FRAME_WIDTH) + "+");
        System.out.printf("|%-" + ((FRAME_WIDTH) / 2 + "s%-" + ((FRAME_WIDTH + 1) / 2)) + "s|%n", "", this.getCity() + " " + title);
        System.out.println("+" + "-".repeat(FRAME_WIDTH) + "+");
    }


    // HANDLE PLANES

    public void addPlane(Plane plane) {
        this.planes.add(plane);
    }

    public void removePlane(Plane plane) {
            this.planes.remove(plane);
        }


    //    Lets the airport update the planes departure times
    public void changeDeparture(Plane plane, Date newDepartureTime) {
        Flight planeFlight = plane.getFlight();
        Date oldDepartureTime = planeFlight.getDepartureTime();
        // Calculate time difference in milliseconds (getTime() return milliseconds)
        long departureDifference = TimeUnit.MILLISECONDS.convert(newDepartureTime.getTime() - oldDepartureTime.getTime(), TimeUnit.MILLISECONDS);
        planeFlight.setDepartureTime(newDepartureTime);
        planeFlight.setArrivalTime(new Date((planeFlight.getArrivalTime().getTime()) + departureDifference));

    }

    public Set<Plane> getPlanes() {
        return planes;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }
}
