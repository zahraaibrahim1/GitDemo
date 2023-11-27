package com.javafortesters.chap008selectionsanddecisions.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleCatorCats {
    /* Write an @Test method that uses a ternary operator to return "cat" if a numberOfCats equals 1.
 And return "cats" if the numberOfCats is not 1
 Rewrite your code so that the ternary operator is used in a method which returns "cat" or "cats"
 depending on the numberOfCats parameter it is called with. e.g.
         assertEquals("2 == cats", "cats", catOrCats(2));*/
        @Test
        public void catOrCats() {
            int numberOfCats = 1;
            assertEquals("1==cat", "cat", (numberOfCats == 1) ? "cat" : "cats");

            numberOfCats= 0;
            assertEquals("0==cats","cats",(numberOfCats==1)?"cat":"cats");

            numberOfCats= 2;
            assertEquals("2==cats","cats",(numberOfCats==1)?"cat":"cats");

        }
        @Test
    public void catOrCatsMethods(){

            assertEquals("1==cat","cat",catorCats(1));
            assertEquals("0==cats","cats",catorCats(0));
            assertEquals("2==cats","cats",catorCats(2));
    }

    private String catorCats(int numberOfCats) {
           return (numberOfCats==1)?"cat":"cats";
    }
}


