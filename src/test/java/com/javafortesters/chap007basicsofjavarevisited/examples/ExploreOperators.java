package com.javafortesters.chap007basicsofjavarevisited.examples;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExploreOperators {

    @Test
    public void traditionalOperatorsExplored(){
        assertEquals(4, 2+2);
        assertEquals(5L, 10L - 5L);
        assertEquals(25.0F, 12.5F * 2F, 0);
        assertEquals(30.2D, 120.8D / 4D, 0);
        assertEquals("abcd", "ab" + "cd");
        assertEquals(1, 9%2);
    }
    @Test
    public void assignmentOperatorsExplored(){
        String ab="ab";
        assertEquals("ab",ab);

        int num=10;
        assertEquals(10,num);

        num+=2;
        assertEquals("+= increments by",12 , num);
        assertEquals(12 , num);
        num -= 4;
        assertEquals("-= decrements by", 8, num);
        num *= 2;
        assertEquals("*= multiplies by", 16, num);
        num /= 4;
        assertEquals("*= multiplies by", 4, num);
        num %=3;
        assertEquals("%= modulus of", 1, num);
    }

    @Test
    public void incrementDecrementOperatorsExplored(){
        int num = 10;
        assertEquals(11, ++num);
        assertEquals(10, --num);
        assertEquals(10, num++);
        assertEquals(11, num);
        assertEquals(11, num--);
        assertEquals(10, num);
    }

    @Test
    public void booleanOperator(){
        assertTrue(8==8);
        assertTrue(10>=9);
        assertTrue(8!=9);
        assertTrue(!false);
        boolean truthy= true;
        //assertEquals(true, truthy);
        assertFalse(!truthy);
    }

    @Test
    public void conditionalOperatorsExplored(){
        assertTrue( true && true);
        assertTrue( true || false);
        assertTrue( false || true);
       // assertTrue( false && true);
        assertFalse( false || false);
        assertFalse( false && true);
    }

    @Test
    public void exploreTernaryOperator(){
        int x= 4>3 ? 2:1;
        assertEquals(2, x);
        assertTrue(5>=4 ? true : false);
    }

    @Test
    public void bitwiseShiftOperatorsExplored(){
        int x = 56;
        assertEquals(x*2, x<<1);
        assertEquals(x*4, x<<2);
        assertEquals(x*8, x<<3);
        x <<=3;
        assertEquals(56*8, x);
        x = Integer.MAX_VALUE;
        assertEquals(Integer.MAX_VALUE/2, x>>1);
        assertEquals(Integer.MAX_VALUE/4, x>>2);
        assertEquals(Integer.MAX_VALUE/8, x>>3);
        x = Integer.MIN_VALUE; // -ve
        assertEquals((Integer.MAX_VALUE/2)+1, x>>>1);
        System.out.println(x);
        System.out.println(x<<=3);
        System.out.println(x>>>1);
    }

    @Test
    public void someStringMethods(){
        String aString = "abcdef";
        assertEquals(6, aString.length());
        assertTrue(aString.compareToIgnoreCase("ABCDEF")==0);
        assertTrue(aString.contains("bcde"));
        assertTrue(aString.startsWith("abc"));
// string indexing starts at 0
        assertEquals('c', aString.charAt(2));
        assertEquals("ef", aString.substring(4));
    }
}


