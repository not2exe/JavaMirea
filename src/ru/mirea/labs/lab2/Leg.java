package ru.mirea.labs.lab2;

public class Leg {
    private boolean isUp = false;
    private final Sides side;
    Leg(Sides _side) {
        side = _side;
    }
    public void raiseLeg() {
        if (!isUp) {
            isUp = true;
            System.out.println("\tHuman raised " + side + " leg");
        }
        else {
            System.out.println("\tThe leg is already up");
        }
    }
    public void lowerLeg() {
        if (isUp) {
            isUp = false;
            System.out.println("\tHuman lowered " + side + " leg");
        }
        else {
            System.out.println("\tThe leg is already down");
        }
    }
    public void moveForward() {
        System.out.println("\tHuman moved " + side + " leg forward");
    }
}
