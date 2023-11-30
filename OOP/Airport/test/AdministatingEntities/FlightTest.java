import AdministatingEntities.FlightStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import AdministatingEntities.Flight;
import Listeners.FlightListener;
import Planes.Plane;
import java.util.Date;

public class FlightTest {

    private Flight flight;
    private Plane plane; // Assuming you have a Plane class
    private Airport airport; // Assuming you have an Airport class
    private FlightListener listener; // Assuming you have a FlightListener interface

    @BeforeEach
    public void setUp() {
        // Initialize your objects here
        flight = new Flight();
        plane = new Plane(); // Adjust as necessary
        airport = new Airport(); // Adjust as necessary
        listener = new FlightListener() {
            // Implement the necessary methods
        };
    }

    @Test
    public void testActivateFlight() {
        flight.activateFlight();
        // Example assertion
        assertTrue(flight.isActive()); // Assuming there's an isActive method to check if flight is active
    }

    @Test
    public void testRun() {
        flight.run();
        // Assertions to check the result of run
        assertTrue(flight.hasRun()); // Assuming hasRun() indicates if run was successful
    }

    @Test
    public void testUpdateStatus() {
        FlightStatus originalStatus = flight.getStatus();
        flight.updateStatus();
        FlightStatus updatedStatus = flight.getStatus();
        assertNotEquals(originalStatus, updatedStatus); // Check if status is updated
    }

    @Test
    public void testAddListener() {
        flight.addListener(listener);
        assertTrue(flight.getListeners().contains(listener)); // Assuming getListeners() returns the set of listeners
    }

    @Test
    public void testGetAssignedPlane() {
        flight.setPlane(plane); // Assuming there's a setter
        assertEquals(plane, flight.getAssignedPlane());
    }

    @Test
    public void testGetDestination() {
        flight.setDestination(airport); // Assuming there's a setter
        assertEquals(airport, flight.getDestination());
    }

    @Test
    public void testSetAndGetStatus() {
        FlightStatus status = FlightStatus.IN_FLIGHT; // Example status
        flight.setStatus(status);
        assertEquals(status, flight.getStatus());
    }

    @Test
    public void testSetAndGetDepartureTime() {
        Date departureTime = new Date(); // Set to some date
        flight.setDepartureTime(departureTime);
        assertEquals(departureTime, flight.getDepartureTime());
    }

    @Test
    public void testSetAndGetArrivalTime() {
        Date arrivalTime = new Date(); // Set to some date
        flight.setArrivalTime(arrivalTime);
        assertEquals(arrivalTime, flight.getArrivalTime());
    }
}
