package ru.mirea.practices.pr3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex4();
        ex5();

    }

    public static void ex4() {
        int x,y,xSpeed,ySpeed,radius;
        System.out.println("Ex 4");
        System.out.print("x(center cords): ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        System.out.print("y(center cords): ");
        y = scanner.nextInt();
        System.out.print("xSpeed: ");
        xSpeed = scanner.nextInt();
        while (checkIsPositiveOrZero(xSpeed)){
            System.out.println("Speed cannot be negative");
            xSpeed = scanner.nextInt();
        }
        System.out.print("ySpeed: ");
        ySpeed = scanner.nextInt();
        while (checkIsPositiveOrZero(ySpeed)){
            System.out.println("Speed cannot be negative");
            ySpeed = scanner.nextInt();
        }
        System.out.print("radius: ");
        radius = scanner.nextInt();
        while (checkIsPositiveOrZero(radius)){
            System.out.println("Speed cannot be negative");
            radius = scanner.nextInt();
        }

        MovableCircle obj = new MovableCircle(x, y, xSpeed, ySpeed, radius);
        System.out.println(obj);
        obj.moveDown();
        obj.moveRight();
        System.out.println(obj);
        for (int i = 0; i < 10; i++) obj.moveRight();
        System.out.println(obj);


    }

    public static void ex5() {
        int x1,x2,y1,y2,xSpeed,ySpeed;
        System.out.println("Ex 5");
        System.out.print("x1(topLeft cords): ");
        Scanner scanner = new Scanner(System.in);
        x1 = scanner.nextInt();
        System.out.print("y1(topLeft cords): ");
        y1 = scanner.nextInt();
        System.out.print("x2(bottomRight cords): ");
        x2 = scanner.nextInt();
        System.out.print("y2(bottomRight cords): ");
        y2 = scanner.nextInt();

        System.out.print("xSpeed: ");
        xSpeed = scanner.nextInt();
        while (checkIsPositiveOrZero(xSpeed)){
            System.out.println("Speed cannot be negative");
            xSpeed = scanner.nextInt();
        }
        System.out.print("ySpeed: ");
        ySpeed = scanner.nextInt();
        while (checkIsPositiveOrZero(ySpeed)){
            System.out.println("Speed cannot be negative");
            ySpeed = scanner.nextInt();
        }

        MovableRectangle rect = new MovableRectangle(x1, y1, x2, y2, xSpeed, ySpeed);
        System.out.println(rect);
        rect.moveDown();
        rect.moveRight();
        System.out.println(rect);
        for (int i = 0; i < 10; i++) rect.moveRight();
        System.out.println(rect);
    }

    public static boolean checkIsPositiveOrZero(int speed) {
        return speed >= 0;
    }

}