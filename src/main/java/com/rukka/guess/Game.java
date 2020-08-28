package com.rukka.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNum = random.nextInt(10) + 1;
//        secretNum = (int)(Math.random() * 10) + 1;
        System.out.println("secret num: " + secretNum);
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (num != secretNum) {
            System.out.print("Please enter a number: ");
            num = scanner.nextInt();
            if (num == secretNum) {
                System.out.println("Great! You got it.");
            } else if (num < secretNum) {
                System.out.println("higher");
            } else {
                System.out.println("lower");
            }
//            System.out.println(num);
        }
    }
}
