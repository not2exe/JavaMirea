package ru.mirea.practices.pr6;

import java.util.ArrayList;


public class MergeSort {
    public static void mergeSort(ArrayList<Student> students, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        ArrayList<Student> l = new ArrayList<>();
        ArrayList<Student> r = new ArrayList<>();
        for(int i = 0;i<mid;i++){
            l.add(students.get(i));
        }
        for(int j = mid;j<n;j++){
            r.add(students.get(j));
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(students, l, r, mid, n-mid);

    }

    private static void merge(ArrayList<Student> students, ArrayList<Student> l, ArrayList<Student> r, int nL, int nR) {
        int i = 0, j = 0, k = 0;
        while (i < nL && j < nR) {
            if (l.get(i).getGPA() <= r.get(j).getGPA()) {
                students.set(k, l.get(i));
                i++;
            } else {
                students.set(k, r.get(j));
                j++;
            }
            k++;
        }
        while (i < nL) {
            students.set(k, l.get(i));
            i++;
            k++;
        }
        while (j < nR) {
            students.set(k, r.get(j));
            j++;
            k++;
        }

    }
}
