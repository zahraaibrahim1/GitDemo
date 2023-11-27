package com.javafortesters.chap007basicsofjavarevisited.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerTypeTest {
    @Test
    public void IntegerTypes(){
        System.out.println( "* 'byte' range: "+
                Byte.MIN_VALUE +" to "+
                Byte.MAX_VALUE);
        System.out.println( "* `short` range: " +
                Short.MIN_VALUE + " to " +
                Short.MAX_VALUE);
        System.out.println( "* `int` range: " +
                Integer.MIN_VALUE + " to " +
                Integer.MAX_VALUE);
        System.out.println( "* `long` range: " +
                Long.MIN_VALUE + " to" +
                Long.MAX_VALUE);
    }

    @Test
    public void exploreIntegerOperators(){
        assertEquals(4,2+2);
        assertEquals(5L,10L-5L);
       // assertEquals(5L, 10L-5D);
    }

}
