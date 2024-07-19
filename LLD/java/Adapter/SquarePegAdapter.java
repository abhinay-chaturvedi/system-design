package Adapter;

public class SquarePegAdapter extends RoundPeg {
    SquarePeg speg;
    SquarePegAdapter(SquarePeg speg) {
        this.speg = speg;
    }
    @Override
    double getRadius() {
        return (Math.sqrt(Math.pow((speg.getWidth() / 2), 2) * 2));
    }
}
