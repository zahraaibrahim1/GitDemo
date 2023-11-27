package com.javafortesters.chap008selectionsanddecisions.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TernaryOperator {
    @Test
    public void ternaryOperatorTest() {
        String url = "www.facebook.com";
        url = url.startsWith("http") ? url : addHttp(url);
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.facebook.com", url);
    }

    private String addHttp(String url) {
        return "http://" + url;
    }

}



