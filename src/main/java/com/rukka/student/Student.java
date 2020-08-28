package com.rukka.student;

public class Student {

    String id;
    String name;
    int englishScore;
    int mathScore;

    public Student(String name, int englishScore, int mathScore) {
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public int highest() {
        return Math.max(englishScore, mathScore);
    }

    public void print() {
        System.out.print(name + "\t" + englishScore + "\t" + mathScore +
                "\t" + getAverage() + "\t" +
                ((getAverage() < 60) ? "FAILED" : "PASS"));
        /*if (getAverage() < 60) {
            System.out.println("\tFAILED");
        } else {
            System.out.println("\tPASS");
        }*/
        char grading;
        switch (((int)getAverage()/10)) {
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }
        System.out.println("\tgrading: " + grading);
    }

    public float getAverage() {
        return ((float)englishScore+mathScore) / 2;
    }
}
