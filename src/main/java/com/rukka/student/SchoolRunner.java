package com.rukka.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
//        userInput();
        Student testStd = new Student("Rukka", 60, 98);
        testStd.print();
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter student's name: ");
        String name = scanner.next();
        System.out.print("Please enter student's english score: ");
        int englishScore = scanner.nextInt();
        System.out.print("Please enter student's math score: ");
        int mathScore = scanner.nextInt();

        Student std = new Student(name, englishScore, mathScore);
        std.print();
        System.out.println("Highest score: " + std.highest());
    }
}
