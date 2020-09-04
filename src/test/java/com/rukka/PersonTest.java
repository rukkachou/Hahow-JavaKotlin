package com.rukka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void bmiTest() {
        Person p = new Person(66.5f, 1.7f);
        Assertions.assertEquals(66.5f/(1.7f * 1.7f), p.bmi());
    }
}
