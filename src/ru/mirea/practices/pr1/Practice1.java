package ru.mirea.practices.pr1;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        System.out.print("Create your ball. Input ball's name: ");
        // Object scanner
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        // Name's emptiness check
        while (name.isEmpty()) {
            System.out.println("Name can't be empty");
            name = scanner.nextLine();
        }
        System.out.print("Input radius of the ball: ");
        double radius = scanner.nextDouble();
        // Radius' positive value check
        while (radius <= 0) {
            System.out.println("Radius have to be positive number");
            radius = scanner.nextDouble();
        }
        System.out.print("Input color of the ball: ");
        String color = scanner.next();
        // Color's emptiness check
        while (color.isEmpty()) {
            System.out.println("Color can't be empty");
            color = scanner.nextLine();
        }
        // Next we create 2 objects of Ball class
        System.out.println("The first ball, created by default:");
        Ball defaultBall = new Ball(); // Ball object created by default constructor
        System.out.println(defaultBall);
        System.out.println("The second ball, created with the given arguments: ");
        Ball ballWithArgs = new Ball(name, radius, color);
        System.out.println(ballWithArgs);
        ballWithArgs.throwIt();
        System.out.println("Diameter of the created ball: " + ballWithArgs.getDiameter());
        defaultBall.throwIt();
    }
}