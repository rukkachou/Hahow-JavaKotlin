package com.rukka;

public class PersonJava {
    String name;
    float weight;
    float height;

    PersonJava(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }
    PersonJava(String name, float weight, float height) {
        this(weight, height);
        this.name = name;
    }

    void hello() {
        System.out.println("Hello Java");
    }

    float bmi() {
        return weight / (height*height);
    }
}
