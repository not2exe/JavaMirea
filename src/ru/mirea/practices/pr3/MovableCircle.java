package ru.mirea.practices.pr3;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    @Override
    public void moveUp() {

    }

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public String toString() {
        return "This is my circle. His coordinates: x = " +
                center.getX() + "\n\t\t\t\t\t\t\t\t\t   y = " + center.getY() +
                "\n" + "And radius: " + radius;
    }

    @Override
    public void moveDown(
    ) {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
