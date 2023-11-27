package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {
    @Test
    public void canAddTwoPlusTwo(){

        int answer= 2+2;
        assertEquals("2+2=4",4, answer);
    }
    @Test
    public void canSubtractTwoFromTwo(){

        int answer2= 2-2;
        assertEquals("2-2=0",0, answer2);
    }

    @Test
    public void canDivideFourByTwo(){

        int answer3= 4/2;
        assertEquals("4/2=2",2, answer3);
    }

    @Test
    public void canMultiplyTwoByTwo(){

        int answer4= 2*2;
        assertEquals("2*2=4",4, answer4);
    }

}
