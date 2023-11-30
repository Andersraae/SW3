package AdministatingEntities;

import Listeners.DepartureAirportListener;
import Planes.PassengerPlane;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Listeners.FlightListener;
import Planes.Plane;
import java.util.Date;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Airport departureAirport, destinationAirport;
    private FlightListener departureListener, destinationListener;
    private FlightStatus initialStatus;

    @BeforeEach
    public void setUp() {
        // Initialize your objects here
        departureAirport = new Airport("Departure country", "Departure city", 1);
        destinationAirport = new Airport("Destination country", "Destination city", 1);

        plane = new PassengerPlane(2);
        Date now = new Date();
        flight = new Flight(plane, new Date(now.getTime() + 61_000), new Date(now.getTime() + 121_000), destinationAirport);

        initialStatus = flight.getStatus();

        departureListener = new DepartureAirportListener(departureAirport);
        destinationListener = new DepartureAirportListener(destinationAirport);
    }

    @Test
    public void testUpdateStatus() {
        flight.updateStatus();
        FlightStatus updatedStatus = flight.getStatus();
        assertNotEquals(initialStatus, updatedStatus);
    }

    @Test
    public void testAddListener() {
        flight.addListener(departureListener);
        assertTrue(flight.getListeners().contains(departureListener));
    }

    @Test
    public void testGetAssignedPlane() {
        assertEquals(plane, flight.getAssignedPlane());
    }

    @Test
    public void testGetDestination() {
        assertEquals(destinationAirport, flight.getDestination());
    }

    @Test
    public void testSetAndGetStatus() {
        FlightStatus status = FlightStatus.IN_FLIGHT;
        flight.setStatus(status);
        assertEquals(status, flight.getStatus());
    }

    @Test
    public void testSetAndGetDepartureTime() {
        Date departureTime = new Date();
        flight.setDepartureTime(departureTime);
        assertEquals(departureTime, flight.getDepartureTime());
    }

    @Test
    public void testSetAndGetArrivalTime() {
        Date arrivalTime = new Date();
        flight.setArrivalTime(arrivalTime);
        assertEquals(arrivalTime, flight.getArrivalTime());
    }
}
