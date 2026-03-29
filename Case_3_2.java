abstract class Transport {
    protected String trackingId;

    public Transport(String trackingId) {
        this.trackingId = trackingId;
    }

    public abstract void dispatch();
}

interface GPS {
    void getCoordinates();
    
    default void pingServer() {
        System.out.println("Status: Online...");
    }
}

interface Autonomous {
    void selfNavigate();
}

class DeliveryDrone extends Transport implements GPS, Autonomous {
    public DeliveryDrone(String trackingId) {
        super(trackingId);
    }

    @Override
    public void dispatch() {
        System.out.println("Drone " + trackingId + " taking off...");
    }

    @Override
    public void getCoordinates() {
        System.out.println("Coordinates: 40.7128 N, 74.0060 W");
    }

    @Override
    public void selfNavigate() {
        System.out.println("Navigating autonomously to destination...");
    }
}

class Truck extends Transport {
    public Truck(String trackingId) {
        super(trackingId);
    }

    @Override
    public void dispatch() {
        System.out.println("Truck " + trackingId + " leaving the loading dock...");
    }
}

public class Case_3_2 {
    public static void main(String[] args) {
        System.out.println("--- Test Case 1 ---");
        Transport t = new DeliveryDrone("D101");
        t.dispatch();

        System.out.println("\n--- Test Case 2 ---");
        if (t instanceof GPS) {
            GPS g = (GPS) t;
            g.pingServer();
        }

        System.out.println("\n--- Test Case 3 ---");
        Transport truck = new Truck("T505");
        if (truck instanceof GPS) {
            System.out.println("Truck has GPS.");
        } else {
            System.out.println("False: Truck does not support GPS.");
        }
    }
}
