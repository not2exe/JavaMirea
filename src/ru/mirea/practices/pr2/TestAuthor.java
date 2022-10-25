package ru.mirea.practices.pr2;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input author's name: ");
        String name = scanner.nextLine();
        while (name.isEmpty()) {
            System.out.println("Name can't be empty");
            name = scanner.nextLine();
        }

        System.out.print("Input email: ");
        String email = scanner.nextLine();
        while (email.isEmpty()) {
            System.out.println("Email can't be empty");
            email = scanner.nextLine();
        }

        System.out.print("And gender (Male/Female): ");
        char gender = scanner.nextLine().charAt(0);
        if (gender != 'M' && gender != 'F') {
            gender = 'U';
        }


        Author newAuthor = new Author(name, email, gender);
        System.out.println("Your newly created author:\n"+newAuthor);
    }
}
