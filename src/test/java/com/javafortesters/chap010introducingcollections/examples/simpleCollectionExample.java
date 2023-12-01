package com.javafortesters.chap010introducingcollections.examples;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class simpleCollectionExample {
    @Test
    public void simpleCollectionExample(){
        String[] numbers0123Array = {"zero", "one", "two", "three"};
        List<String> numbers0123 = Arrays.asList(numbers0123Array);
        for(String numberText : numbers0123){
            System.out.println(numberText);
        }
        assertEquals("zero", numbers0123.get(0));
        assertEquals("three", numbers0123.get(3));
        System.out.println("GitTest1");
        System.out.println("GitTest2");
    }
    
}


