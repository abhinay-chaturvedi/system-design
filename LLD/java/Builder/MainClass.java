package Builder;

public class MainClass {
    public static void main(String args[]) {
        Director dir = new Director();
        Builder builder = new CarBuilder();
        Car car = dir.counstructCar(builder);
        // System.out.println(car.getDetails());
        car.getDetails();
    }
}

class Director {
    
    Car counstructCar(Builder builder) {
        builder.setEngine("high");
        builder.setSeats(400);
        builder.setGPS(true);
        return builder.getProducts();
    }
}