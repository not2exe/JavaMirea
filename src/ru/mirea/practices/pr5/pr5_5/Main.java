package ru.mirea.practices.pr5.pr5_5;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        N = scanner.nextInt();
        System.out.println("Sum of N's digits: "+Number.countSumOfDigits(N));
    }
}
