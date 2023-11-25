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

    public void addPlane(Plane plane) {
        this.planes.add(plane);
    }


//    Handle planes

    //    Lets the airport update the planes departure times
    public void changeDeparture(int planeId, Date newDepartureTime) {
        for (Plane plane : this.planes) {
            if (plane.getPlaneId() == planeId) {
                Flight planeFlight = plane.getFlight();
                Date oldDepartureTime = planeFlight.getDepartureTime();
                // Calculate time difference in milliseconds (getTime() return milliseconds)
                long departureDifference = TimeUnit.MILLISECONDS.convert(newDepartureTime.getTime() - oldDepartureTime.getTime(), TimeUnit.MILLISECONDS);
                planeFlight.setDepartureTime(newDepartureTime);
                planeFlight.setArrivalTime(new Date((planeFlight.getArrivalTime().getTime()) + departureDifference));
            }
        }
    }

    public void displayArrivals() {
        this.makeFrame();
        for (Plane plane : this.getPlanes()) {
            Flight flight = plane.getFlight();
            if (flight.getStatus() == FlightStatus.IN_FLIGHT || flight.getStatus() == FlightStatus.UNLOADING) {
                System.out.printf("| Flight Status: %-4s | Departure: %-8s | Arrival: %-8s | Destination: %-15s |%n",
                        flight.getStatus(), flight.getDepartureTime(), flight.getArrivalTime(), flight.getDestination().getCity());
                System.out.println("+" + "-".repeat(FRAME_WIDTH) + "+");
            }
        }
    }

    public void displayDepartures() {
        this.makeFrame();
        for (Plane plane : this.getPlanes()) {
            Flight flight = plane.getFlight();
            if (flight.getStatus() == FlightStatus.LOADING) {
                System.out.printf("| Flight Status: %-4s | Departure: %-8s | Arrival: %-8s | Destination: %-15s |%n",
                        flight.getStatus(), flight.getDepartureTime(), flight.getArrivalTime(), flight.getDestination().getCity());
                System.out.println("+" + "-".repeat(FRAME_WIDTH) + "+");
            }
        }
    }

    private void makeFrame() {
        System.out.println("+" + "-".repeat(FRAME_WIDTH) + "+");
        System.out.printf("|%-" + ((FRAME_WIDTH) / 2 + "s%-" + ((FRAME_WIDTH + 1) / 2)) + "s|%n", "", "Airport Status");
        System.out.println("+" + "-".repeat(FRAME_WIDTH) + "+");
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
