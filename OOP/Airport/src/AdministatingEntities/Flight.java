package AdministatingEntities;

import Listeners.FlightListener;
import Planes.FlightStatus;
import Planes.Plane;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Flight {

    private int flightId;

    private Plane assignedPlane;

    private Date departureTime, arrivalTime;

    private Airport destination;

    private Set<FlightListener> listeners = new HashSet<>();

    private FlightStatus status;

    public Flight(int flightId, Plane assignedPlane, Date departureTime, Date arrivalTime, Airport destination) {
        this.flightId = flightId;
        this.assignedPlane = assignedPlane;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.destination = destination;
        this.status = FlightStatus.INACTIVE;

        this.activateFlight();
    }

    public void activateFlight() {
        Runnable update = new Runnable() {
            public void run() {
                Flight.this.updateStatus();

                for (FlightListener listener : listeners) {
                    listener.flightUpdate(Flight.this);
                }
            }
        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(update, 0, 5, TimeUnit.SECONDS); // run updateAirportStatus every x seconds
    }

    public void updateStatus() {
        Date now = new Date();
        long timeUntilDepartue = TimeUnit.MINUTES.convert(Flight.this.getDepartureTime().getTime() - now.getTime(), TimeUnit.MILLISECONDS);
        long timeSinceArrival = TimeUnit.MINUTES.convert(Flight.this.getArrivalTime().getTime() - now.getTime(), TimeUnit.MILLISECONDS);

        if (timeUntilDepartue <= 30 && timeUntilDepartue > 0) {
            Flight.this.setStatus(FlightStatus.LOADING);
        } else if (timeUntilDepartue <= 0 && timeSinceArrival < 0) {
            Flight.this.setStatus(FlightStatus.IN_FLIGHT);
        } else if (timeSinceArrival >= 0 && timeSinceArrival < 30) {
            Flight.this.setStatus(FlightStatus.UNLOADING);
        } else if (timeSinceArrival >= 30) {
            Flight.this.setStatus(FlightStatus.INACTIVE);
        }
    }

    public void addListener(FlightListener listener) {
        this.listeners.add(listener);
    }

    public Plane getAssignedPlane() {
        return assignedPlane;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }

    public FlightStatus getStatus() {
        return this.status;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    long getFlightTime() {
        return arrivalTime.getTime() - departureTime.getTime();
    }
}
