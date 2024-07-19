package Adapter;

public class RoundHole {
    private double radius;
    RoundHole(double radius) {
        this.radius = radius;
    }
    double getRadius() {
        return this.radius;
    }
    boolean fits(RoundPeg rpeg) {
        return this.radius >= rpeg.getRadius();
    }
}
