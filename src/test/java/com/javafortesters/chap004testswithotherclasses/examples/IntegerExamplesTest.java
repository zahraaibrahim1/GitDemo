package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntegerExamplesTest {

    @Test
    public void integerExploration() {
    // instantiating an integer with a string
        Integer four = new Integer(4);
        assertEquals("intValue returns int 4", 4, four.intValue());
    //autoboxing
        Integer five = 5;
        assertEquals("intValue returns int 5", 5, five.intValue());

        Integer six = 6;
        assertEquals("autoboxing assignment for six", 6, six.intValue());
    }

    //testing static methods where we don't instantiate the class
    @Test
    public void canConvertIntToHex(){
        Integer.toHexString(11);
        assertEquals("11 becomes b","b",Integer.toHexString(11));

        Integer.toHexString(10);
        assertEquals("10 becomes a","a",Integer.toHexString(10));

        Integer.toHexString(3);
        assertEquals("3 becomes 3","3",Integer.toHexString(3));

        Integer.toHexString(21);
        assertEquals("21 becomes 15","15",Integer.toHexString(21));

    }

    //testing public constants on a class which are variables and not methods.
    @Test
    public void canConfirmIntMinAndMaxLimits(){
       int minValue= -2147483648;
       assertEquals("Min value is -2147483648", minValue,Integer.MIN_VALUE);
    }


    @Test
    public void confirmHowOperatorWorkOnVariables(){
        Integer firstFour = new Integer(4);
        Integer secondFour = new Integer(4);
     //   assertTrue(firstFour==secondFour);// should  fail because 2 variables are referring to different objects and can't equal each other
        assertTrue(firstFour.equals(secondFour));//should pass
    }

}
