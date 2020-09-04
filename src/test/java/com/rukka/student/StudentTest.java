package com.rukka.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void highestTest() {
        Student s = new Student("Scute", 60, 80);
        Assertions.assertEquals(80, s.highest());
    }
    @Test
    public void getAverageTest() {
        Student s = new Student("Scute", 60, 80);
        Assertions.assertEquals((60f + 80) / 2, s.getAverage());
    }
}
