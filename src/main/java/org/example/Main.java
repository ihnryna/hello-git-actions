package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! I can add numbers.");
        Scanner in = new Scanner(System.in);

        boolean repeat = true;

        while (repeat) {
            System.out.println("Enter first number: ");
            int a = in.nextInt();

            System.out.println("Enter second number: ");
            int b = in.nextInt();

            System.out.println("Sum is: " + Calculator.add(a, b));

            System.out.println("Repeat? Y/N");
            String answer = in.next();
            repeat = answer.equalsIgnoreCase("Y");
        }
    }
}