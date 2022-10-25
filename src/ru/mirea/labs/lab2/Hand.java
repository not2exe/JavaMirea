package ru.mirea.labs.lab2;

public class Hand {
    private boolean isClenched = false;
    private boolean isRaised = false;
    private final Sides side;

    Hand(Sides _side) {
        side = _side;
    }

    public boolean isClenched() {
        return isClenched;
    }

    public boolean isRaised() {
        return isRaised;
    }

    public String getSide() {
        return side.toString();
    }

    public void raiseHand() {
        if (!isRaised) {
            isRaised = true;
            System.out.println("\tHuman raised " + side + " hand");
        } else {
            System.out.println("\tThe hand is already raised");
        }
    }

    public void lowerHand() {
        if (isRaised) {
            isRaised = false;
            System.out.println("\tHuman lowered " + side + " hand");
        } else {
            System.out.println("\tThe hand is already down");
        }
    }

    public void clenchHand() {
        if (!isClenched) {
            isClenched = true;
            System.out.println("\tHuman clenched " + side + " hand");
        } else {
            System.out.println("\tThe hand is already clenched");
        }
    }

    public void unclenchHand() {
        if (isClenched) {
            isClenched = false;
            System.out.println("\tHuman unclenched " + side + " hand");
        } else {
            System.out.println("\tThe hand is already unclenched");
        }
    }

    public void wave() {
        if (!isClenched && isRaised) {
            System.out.println("\tHuman waved " + side + " hand");
        } else {
            System.out.println("\tHuman did something wrong");
        }
    }

    public void moveForward() {
        System.out.println("\tHuman moved " + side + " hand forward");
    }

    public void moveBack() {
        System.out.println("\tHuman moved " + side + " hand back");
    }
}
