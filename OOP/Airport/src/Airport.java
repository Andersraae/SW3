import Planes.Plane;

public class Airport {

    Plane[] planes;
    String country;
    int planeCapacity;

    public Airport(Plane[] planes, String country, int planeCapacity) {
        this.planes = planes;
        this.country = country;
        this.planeCapacity = planeCapacity;
    }


}
