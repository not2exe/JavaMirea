package ru.mirea.practices.pr6;

public class Student {
    private final String name;
    private final double GPA;

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    public Student(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
