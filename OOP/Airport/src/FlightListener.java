import Planes.Plane;
import Planes.PlaneStatus;


// Observer pattern???????
public interface FlightListener {
    PlaneStatus updatePlaneStatus(Plane plane);
}
