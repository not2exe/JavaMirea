package ru.mirea.practices.pr3;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }


    @Override
    public String toString() {
        return "This is my rectangle. His coordinates: x = " +
                (topLeft.getX() + bottomRight.getX()) / 2.0f + "\n\t\t\t\t\t\t\t\t\t   y = " + (topLeft.getY() + bottomRight.getY()) / 2.0f;
    }

    @Override
    public void moveUp() {
        if (isSpeedNotEqual()) {
            System.out.println("speed is not equal... we just can't move =(");
            return;
        }
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        if (isSpeedNotEqual()) {
            System.out.println("speed is not equal... we just can't move =(");
            return;
        }
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        if (isSpeedNotEqual()) {
            System.out.println("speed is not equal... we just can't move =(");
            return;
        }
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        if (isSpeedNotEqual()) {
            System.out.println("speed is not equal... we just can't move =(");
            return;
        }
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    private boolean isSpeedNotEqual() {
        return (topLeft.getXSpeed() != bottomRight.getXSpeed() ||
                topLeft.getYSpeed() != bottomRight.getYSpeed());
    }

    public MovablePoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MovablePoint topLeft) {
        this.topLeft = topLeft;
    }

    public MovablePoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MovablePoint bottomRight) {
        this.bottomRight = bottomRight;
    }
}
