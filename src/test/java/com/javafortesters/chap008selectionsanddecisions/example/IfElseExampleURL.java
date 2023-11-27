package com.javafortesters.chap008selectionsanddecisions.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IfElseExampleURL {
    String url = "www.youtube.com";

    private String addHttp(String url) {
        return "http://" + url;
    }

    @Test
    public void ifStatementURLTest() {
        if (!url.startsWith("http://")) {
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.youtube.com", url);

    }

    @Test
    public void ifElseStatementURLTest() {
        if (url.startsWith("http://")) {
            // do nothing
        } else
            url = addHttp(url);

        assertEquals("http://www.youtube.com", url);
        assertTrue(url.startsWith("http://"));
    }

    @Test
    public void nestedIfElseTest() {
        String url = "facebook.com";
        if (url.startsWith("http:/")) {
            //do nothing
        } else {
            if (!url.startsWith("www.")) {
                url = "www." + url;
            }
            url = addHttp(url);
        }
    }

}