package ru.mirea.labs.lab2;

// ВАРИАНТ 2. Создать класс, описывающий тело человека(Human). Для описания
//каждой части тела создать отдельные классы(Head, Leg, Hand).
//Описать необходимые свойства и методы для каждого класса.
//Протестировать работу класса Human.

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        boolean rightHanded;
        String answer,name,skinColor,hairColor,eyesColor;
        Gender gender;
        // Creating first human
        System.out.print("Human simulator.\n\tName: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        while (true) {
            System.out.print("\tGender(f/m): ");
            answer = scanner.next();
            if (answer.equals("f") || answer.equals("m")){
                if(answer.equals("f")){
                    gender = Gender.FEMALE;
                }
                else {
                    gender = Gender.MALE;
                }
                break;
            }
            System.out.println("Error! Enter your information correctly");
        }
        System.out.print("\tSkin color: ");
        skinColor = scanner.nextLine();
        System.out.print("\tHair color: ");
        hairColor = scanner.nextLine();
        System.out.print("\tEyes color: ");
        eyesColor = scanner.nextLine();

        while (true) {
            System.out.print("\tRight-handed?(yes/no): ");
            answer = scanner.nextLine();
            if (answer.equals("yes") || answer.equals("no"))
                break;
            System.out.println("Error! Enter your information correctly");
        }
        rightHanded = answer.equals("yes");
        System.out.println();
        // Test human methods
        Human humanMain = new Human(name, gender, skinColor, hairColor, eyesColor, rightHanded);
        humanMain.talk("My name is " + humanMain.getHumanName());
        humanMain.talk("My skin color is " + humanMain.getSkinColor());
        humanMain.walk();
        System.out.println("!!!" + humanMain.getHumanName() + " saw something delicious in front of him!!!");
        humanMain.take();
        humanMain.eat();
        Human humanAnother = new Human();
        humanAnother.talk("My name is " + humanAnother.getHumanName());
    }
}
