package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = "";
        String lastName = "";

        Formatting formatting = new Formatting(firstName, lastName);

        while (firstName.isEmpty()) {
            System.out.println("please enter your first name");
            System.out.print("First name: ");
            firstName = scanner.nextLine().trim();


            if (firstName.isEmpty()) {
                System.out.println("must have a first name");
            }
        }
        formatting.setFirstName(firstName);

        System.out.print("Middle name: ");
        String middleName = scanner.nextLine().trim();
        formatting.setMiddleName(middleName);

        while (lastName.isEmpty()) {
            System.out.println("please enter your Last name");
            System.out.print("Last name: ");
            lastName = scanner.nextLine().trim();


            if (lastName.isEmpty()) {
                System.out.println("must have a Last name");
            }
        }
        formatting.setLastName(lastName);

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();
        formatting.setSuffix(suffix);

        System.out.print("prefix: ");
        String prefix = scanner.nextLine().trim();
        formatting.setPrefix(prefix);

        System.out.println(formatting);
    }
}

