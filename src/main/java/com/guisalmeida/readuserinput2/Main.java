package com.guisalmeida.readuserinput2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handles the enter character added to next line
        int userAge = LocalDate.now().getYear() - yearOfBirth;

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Welcome " + name + ", and you are " + userAge + " years old.");

        scanner.close();
    }
}

