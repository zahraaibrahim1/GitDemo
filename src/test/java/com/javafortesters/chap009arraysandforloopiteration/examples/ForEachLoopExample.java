package com.javafortesters.chap009arraysandforloopiteration.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForEachLoopExample {
    @Test
    public void forEachLoop() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday"};
        String days = "";
        for (String workday : workdays) {
            days = days + "|" + workday;
        }
        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days);
        System.out.println(days);
    }
}
