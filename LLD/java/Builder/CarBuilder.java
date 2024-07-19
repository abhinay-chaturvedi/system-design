package Builder;

public class CarBuilder implements Builder {
    private Car car;
    CarBuilder() {
        this.car = this.reset();
    }
    @Override
    public Car reset() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'reset'");
        return this.car = new Car();
    }

    @Override
    public Car setSeats(int seats) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'setSeats'");
        this.car.setSeats(seats);
        return this.car;
        
    }

    @Override
    public Car setEngine(String engine) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'setEngine'");
        this.car.setEngine(engine);
        return this.car;
    }

    @Override
    public Car setTripComputer(String comp) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'setTripComputer'");
        this.car.setTripComputer(comp);
        return this.car;

    }

    @Override
    public Car setGPS(boolean gps) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'setGPS'");
        this.car.setGPS(gps);
        return this.car;
    }
    public Car getProducts() {
        return this.car;
    }
    
}
