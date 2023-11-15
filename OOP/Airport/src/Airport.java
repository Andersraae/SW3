import Planes.Flight;
import Planes.Plane;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Airport {

    private Set<Plane> planes;
    private String country, city;
    private int planeCapacity;

    public Airport(HashSet<Plane> planes, String country, String city, int planeCapacity) {
        this.planes = planes;
        this.country = country;
        this.city = city;
        this.planeCapacity = planeCapacity;
    }

    public Airport(String country, String city, int planeCapacity) {
        this.country = country;
        this.city = city;
        this.planeCapacity = planeCapacity;
        this.planes = HashSet.newHashSet(planeCapacity);
    }

    public void addPlane(Plane plane){
        this.planes.add(plane);
    }


//    Handle planes
    public void updatePlaneState(int planeId, String state){
        for (Plane plane: this.planes) {
            if (plane.getPlaneId() == planeId) {
                plane.setState(state);
            }
        }
    }

//    Lets the airport update the planes departure times
    public void changeDeparture(int planeId, Date newDepartureTime){
        for (Plane plane: this.planes) {
            if (plane.getPlaneId() == planeId) {
                Flight planeFlight = plane.getFlight();
                Date oldDepartureTime = planeFlight.getDepartureTime();
                // Calculate time difference in milliseconds (getTime() return milliseconds)
                long departureDifference = TimeUnit.MILLISECONDS.convert(newDepartureTime.getTime()-oldDepartureTime.getTime(), TimeUnit.MILLISECONDS);
                planeFlight.setDepartureTime(newDepartureTime);
                planeFlight.setArrivalTime(new Date((planeFlight.getArrivalTime().getTime()) + departureDifference));
            }
        }
    }


    public Set<Plane> getPlanes() {
        return planes;
    }
}
