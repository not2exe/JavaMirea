package ru.mirea.labs.lab1;

public class FactorialMethodClass {
    public static long fact(int n) {
        long pr = 1;
        for (int i = 2; i <= n; i++)
            pr *= i;
        return pr;
    }

}
