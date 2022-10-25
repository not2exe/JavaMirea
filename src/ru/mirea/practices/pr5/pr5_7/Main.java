package ru.mirea.practices.pr5.pr5_7;

// Вариант 5.7. Разложение на множители

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        N = scanner.nextInt();
        System.out.print("N's prime decompose: ");
        PrimeDecomposer.PrimeDecompose(N, 2);
    }

}
