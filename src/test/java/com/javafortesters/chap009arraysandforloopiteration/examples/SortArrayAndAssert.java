package com.javafortesters.chap009arraysandforloopiteration.examples;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SortArrayAndAssert {

    @Test
    public void sortWorkDays() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Arrays.sort(workdays);
        assertEquals(workdays[0], "Friday");
        assertEquals(workdays[1], "Monday");
    }

    @Test
    public void sortWorkDaysMixedCase() {
        String[] workdays = {"monday", "Tuesday", "Wednesday", "thursday", "Friday"};
        Arrays.sort(workdays);
        assertEquals(workdays[0], "Friday");
        assertEquals(workdays[1], "monday");
        System.out.println("friday");
        System.out.println("monday");
        System.out.println("Tuesday");
    }
}
