package com.rukka.student;

public class GraduateStudent extends Student {
    int thesisScore;
//    static int pass = 70;
    public GraduateStudent(String name, int englishScore, int mathScore, int thesisScore) {
        super(name, englishScore, mathScore);
        this.thesisScore = thesisScore;
        pass = 70;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("\tthesis score: " + thesisScore);
    }
    /*@Override
    public void print() {
        System.out.print(name + "\t" + englishScore + "\t" + mathScore +
                "\t" + thesisScore + "\t" + getAverage() + "\t" +
                ((getAverage() < pass) ? "FAILED" : "PASS"));
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
    }*/
}
