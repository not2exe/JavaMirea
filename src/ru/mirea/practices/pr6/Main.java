package ru.mirea.practices.pr6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    final static Random random = new Random();
    public static Student generateStudent() {
        String[] names = {
                "Илья",
                "Николь",
                "Эмилия",
                "Елизавета",
                "Никита",
                "Марьям",
                "Михаил",
                "Мария",
                "Екатерина",
                "Вера"
        };
        return new Student(names[Math.abs(random.nextInt()%10)],Math.abs(random.nextDouble()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        ArrayList<Student> arrayList = new ArrayList<Student>();
        System.out.print("Введите кол-во студентов: ");
        n = scanner.nextInt();
        for(int i=0;i<n;i++){
            arrayList.add(generateStudent());
        }
        System.out.println(arrayList);
        MergeSort.mergeSort(arrayList,arrayList.size());
        System.out.println(arrayList);
    }
}
