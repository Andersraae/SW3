import Planes.Plane;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class Airport {

    private Set<Plane> planes;
    private String country, city;
    private int planeCapacity;

    public Airport(Set<Plane> planes, String country, String city, int planeCapacity) {
        this.planes = planes;
        this.country = country;
        this.city = city;
        this.planeCapacity = planeCapacity;
    }

    public Airport(String country, String city, int planeCapacity) {
        this.country = country;
        this.city = city;
        this.planeCapacity = planeCapacity;
    }

    public void addPlane(Plane plane){
        this.planes.add(plane);
    }

    public void updatePlaneState(int planeId, String state){
        for (Plane plane: this.planes) {
            if (plane.getPlaneId() == planeId) {
                plane.setState(state);
            }
        }
    }

    public void changeDeparture(int planeId, Date newDepartureTime){
        for (Plane plane: this.planes) {
            if (plane.getPlaneId() == planeId) {
                Date oldDepartureTime = plane.getDepartureTime();
                int departureDifference = Math.abs(oldDepartureTime.compareTo(newDepartureTime));
                plane.setDepartureTime(newDepartureTime);
//                plane.setArrivalTime(plane.getArrivalTime() + departureDifference); // Does not work
            }
        }
    }

}
