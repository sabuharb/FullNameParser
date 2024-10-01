package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim();

        System.out.println("You entered: '" + fullName + "'");

        String[] nameParts = fullName.split("\\s+");


        if (nameParts.length == 2) {
            String firstName = nameParts[0];
            String lastName = nameParts[1];
            System.out.println("First name: " + firstName);
            System.out.println("Middle name: (None)");
            System.out.println("Last name: " + lastName);
        } else if (nameParts.length == 3) {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastname = nameParts[2];    // Fixed the variable nable
            System.out.println("First name: " + firstName);
            System.out.println("Middle name: " + middleName);
            System.out.println("Last name: " + lastname);
        } else {
            System.out.println("Invalid name format. Please provide your name in 'first last' or 'first middle last' format.");
        }

        scanner.close();
    }
}



