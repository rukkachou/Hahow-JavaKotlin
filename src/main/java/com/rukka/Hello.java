package com.rukka;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello Java");
        PersonJava p = new PersonJava(66.5f, 1.7f);
        p.hello();
//        p.weight = 66.5f;
//        p.height = 1.7f;
        System.out.println(p.bmi());
        System.out.println(("abcde").charAt(4));
        System.out.println(("abcde").substring(1, 4) + " " + ("1234567").length());
        /*int age = 19;
        Integer age2 = 19;
        char c = 'A';
        char c = 'A';
        Character c2 = 'B';
        byte b = 120;
        float weight = 66.5f;
//        Float
        double height = 1.7;
//        Double
        boolean enrolled = true;
//        Boolean
        String name = "Tom";*/
    }
}
