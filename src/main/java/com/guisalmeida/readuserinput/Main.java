package com.guisalmeida.readuserinput;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();

        if (!hasNextInt) {
            System.out.println("Unable to parse year of birth");
            scanner.close();
            return;
        }

        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handles the enter character added to next line
        int userAge = LocalDate.now().getYear() - yearOfBirth;

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        if (userAge >= 0 && userAge <= 100) {
            System.out.println("Welcome " + name + ", and you are " + userAge + " years old.");
        } else {
            System.out.println("Invalid year of birth.");
        }

        scanner.close();
    }
}

