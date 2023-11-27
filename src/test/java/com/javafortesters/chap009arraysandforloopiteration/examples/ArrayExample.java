package com.javafortesters.chap009arraysandforloopiteration.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayExample {
    @Test
    public void arrayExampleTest() {
        String[] number0123 = {"zero", "one", "two", "three"};
        for (String numberText : number0123) {
            System.out.println(numberText);
        }
        assertEquals("zero",number0123[0]);
        assertEquals("one",number0123[1]);
    }
}

