package com.rukka.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        /*int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);*/
        int secret = new Random().nextInt(10) + 1;
        System.out.println("Secret num: " + secret);
        Scanner scanner = new Scanner(System.in);
        for (int i= 1; i <= 4; i++) {
            System.out.print("Please enter a number(" + i + "/4): ");
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            System.out.print(number + " -> ");
            if (number > secret) {
                System.out.println("lower");
            } else if (number < secret) {
                System.out.println("higher");
            } else {
                System.out.println("Great! You got it.");
                break;
            }
        }
        System.out.println("The End");
    }
}
