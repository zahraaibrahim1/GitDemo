package com.javafortesters.chap008selectionsanddecisions.example;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExampleOfTruthy {
    @Test
            public void TruthyTest(){
    boolean truthy=true;
    if (truthy)
    assertTrue(truthy);
    if(!truthy)
        assertFalse(!truthy);
    }

    @Test
    public void Truthy2Test(){
        boolean truthy=true;
        if (truthy)
            assertTrue(truthy);
        else
            assertFalse(!truthy);
    }


}
