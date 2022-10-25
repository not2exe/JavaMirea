package ru.mirea.practices.pr5.pr5_6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        N = scanner.nextInt();
        if (PrimeChecker.isPrime(N, 2)) {
            System.out.println("YES");
        } else
            System.out.println("NO");
    }
}
