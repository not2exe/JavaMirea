package ru.mirea.practices.pr5.pr5_5;

public class Number {
    public static int countSumOfDigits(int N) {
        if (N % 10 == N)
            return N;
        else
            return countSumOfDigits(N/10) + N % 10;
    }
}
