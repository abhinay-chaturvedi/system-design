package Builder;

public class Car {
    private int seats;
    private String engine;
    private String tripComputer;
    private boolean gps;
    void setSeats(int seats) {
        this.seats = seats;
    }
    void setEngine(String e) {
        this.engine = e;
    }
    void setTripComputer(String comp) {
        this.tripComputer = comp;
    }
    void setGPS(boolean gps) {
        this.gps = gps;
    }
    void getDetails() {
        System.out.println(engine + " " + seats + " " + gps + " " + tripComputer);
    }
}
