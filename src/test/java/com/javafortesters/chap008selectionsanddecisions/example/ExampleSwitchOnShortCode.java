package com.javafortesters.chap008selectionsanddecisions.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleSwitchOnShortCode {
    @Test
    public void switchCode() {
        assertEquals("United Kingdom", shortCode("Uk"));
        assertEquals("United States", shortCode("US"));
        assertEquals("United States", shortCode("USA"));
        assertEquals("France", shortCode("Fr"));
        assertEquals("Sweden", shortCode("SE"));
        assertEquals("Rest Of World", shortCode("LB"));
    }

    public String shortCode(String shortC) {
        String Country;
        switch (shortC.toUpperCase()) {
            case "UK":
                Country = "United Kingdom";
                System.out.println("United Kingdom");
                break;
            case "US":
                Country = "United States";
                break;
            case "USA":
                Country = "United States";
                break;
            case "FR":
                Country = "France";
                break;
            case "SE":
                Country = "Sweden";
                break;
            default:
            Country = "Rest Of World";
            break;

        }
        return Country;
    }

}
