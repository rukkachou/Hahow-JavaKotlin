package com.rukka.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
//        userInput();
//        Student.pass = 90;
        Student std = new Student("Rukka",
                60, 98);
        Student std2 = new Student("Scute",
                70, 90);
        Student std3 = new Student("Janee",
                30, 40);
        GraduateStudent gStd = new GraduateStudent("Jack",
                60, 60, 60);
        gStd.print();
        std.print();
        std2.print();
        std3.print();
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
