package com.guisalmeida.readuserinput.challenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (count < 10) {
            System.out.println("Enter number #" + (count+1) + ": ");

            boolean hasNextInt = scanner.hasNextInt();

            if (!hasNextInt) {
                System.out.println("Enter a valid number!");
            } else {
                sum += scanner.nextInt();
                count++;
            }

            scanner.nextLine(); // handles the enter character added to next line
        }

        System.out.println("Total is: "+sum);
        scanner.close();
    }
}


