package Builder;

public interface Builder {
    Car reset();
    Car setSeats(int seats);
    Car setEngine(String e);
    Car setTripComputer(String comp);
    Car setGPS(boolean gps);
    Car getProducts();
}
