package Adapter;

public class MainClass {
    public static void main(String args[]) {

        RoundHole rhole = new RoundHole(100);
        RoundPeg rpeg = new RoundPeg(50);
        SquarePeg speg = new SquarePeg(40);
        // SquarePegAdapter sPegAdapter = new SquarePegAdapter(speg);
        SquarePegAdapter sPegAdapter = new SquarePegAdapter(speg);
        System.out.println(rhole.fits(sPegAdapter));
    }
}
