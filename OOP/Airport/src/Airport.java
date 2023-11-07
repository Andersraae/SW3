import Planes.PassengerPlane;
import Planes.Plane;

import java.util.*;

public class Airport {

    private HashSet<Plane> planes;
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
                Date oldDepartureTime = plane.getDepartureTime();
                int departureDifference = Math.abs(oldDepartureTime.compareTo(newDepartureTime));
                plane.setDepartureTime(newDepartureTime);
                plane.setArrivalTime(new Date(((int) plane.getArrivalTime().getTime()) + departureDifference));
            }
        }
    }

}
