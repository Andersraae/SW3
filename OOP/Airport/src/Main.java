import Planes.PassengerPlane;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Airport copenhagenAirport = new Airport("Denmark", "Copenhagen", 200);
        Airport tarmAirport = new Airport("Denmark", "Tarm", 2);
        System.out.println(new Date() + " iughjghv");

        copenhagenAirport.addPlane(new PassengerPlane(1, new Date(), new Date(), "Awaiting", 2));
        copenhagenAirport.changeDeparture(1, new Date());
    }
}