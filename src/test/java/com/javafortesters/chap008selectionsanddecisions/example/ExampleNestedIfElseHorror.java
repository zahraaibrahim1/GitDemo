package com.javafortesters.chap008selectionsanddecisions.example;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExampleNestedIfElseHorror {
    Boolean truthy = true;
    Boolean falsey = false;

    @Test
    public void nestedIfElseHorror() {
        if (truthy) {
            if (!falsey) {
                if (truthy && !falsey) {
                    if (falsey | truthy) {
                        System.out.println("T | F");
                        assertTrue(truthy);
                        assertFalse(falsey);

                    }
                }
            } else {
                System.out.println("T | T");
                assertTrue(truthy);
                assertTrue(falsey);
            }
        } else {
            if (!truthy) {
                if (falsey) {
                    System.out.println("F | T");
                    assertTrue(falsey);
                    assertFalse(truthy);
                } else {
                    System.out.println("F | F");
                    assertFalse(falsey);
                    assertFalse(truthy);
                }
            }
        }
    }
}
