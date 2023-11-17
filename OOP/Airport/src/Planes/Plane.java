package Planes;

public abstract class Plane {
    private final int planeId;
    private PlaneStatus status;
    private Flight flight;

    public Plane(int planeId) {
        this.planeId = planeId;
        this.status = PlaneStatus.INACTIVE;
    }

    public int getPlaneId() {
        return planeId;
    }

    public PlaneStatus getStatus() {
        return this.status;
    }

    public void setState(PlaneStatus status) {
        this.status = status;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }
}
