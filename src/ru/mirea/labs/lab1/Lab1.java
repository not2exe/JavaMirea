package ru.mirea.labs.lab1;

// ВАРИАНТ 5. Создать метод, вычисляющий* факториал числа с помощью цикла, проверить работу метода.

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        System.out.println(n + "! = " + FactorialMethodClass.fact(n));
    }
}
