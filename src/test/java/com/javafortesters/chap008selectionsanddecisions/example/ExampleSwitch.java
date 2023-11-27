package com.javafortesters.chap008selectionsanddecisions.example;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class ExampleSwitch {
    @Test
    public void SwitchExample() {
        assertEquals("M", likelyGenderIs("Mr"));
        assertEquals("M", likelyGenderIs("sir"));
        assertEquals("M", likelyGenderIs("master"));
        assertEquals("F", likelyGenderIs("miss"));
        assertEquals("F", likelyGenderIs("mrs"));
        assertEquals("F", likelyGenderIs("ms"));
        assertEquals("F", likelyGenderIs("lady"));
        assertEquals("F", likelyGenderIs("madam"));
    }

    public String likelyGenderIs(String title) {
        String likelyGender;
        switch (title.toLowerCase()) {
            case "mr":
                likelyGender = "M";
                System.out.println("M");
                break;
            case "sir":
                likelyGender = "M";
                System.out.println("M");
                break;
            case "master":
                likelyGender = "M";
                System.out.println("M");
                break;
            default:
                likelyGender = "F";
                System.out.println("F");
                break;
        }
        return likelyGender;


    }

}


