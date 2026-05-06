package com.pluralsight;

import java.util.Scanner;

public class Formatting {

    private Formatting() {
    }

    public static String format_FullName(String firstName, String lastName) {

        Scanner scanner = new Scanner(System.in);

        while (firstName.isEmpty()) {
            System.out.println("please enter your first name");
            System.out.print("First name: ");
            firstName = scanner.nextLine().trim();

            if (firstName.isEmpty()) {
                System.out.println("must have a first name");
            }
        }

        while (lastName.isEmpty()) {
            System.out.println("please enter your Last name");
            System.out.print("Last name: ");
            lastName = scanner.nextLine().trim();

            if (lastName.isEmpty()) {
                System.out.println("must have a Last name");
            }
        }

        return lastName + " " + firstName;
    }
}

