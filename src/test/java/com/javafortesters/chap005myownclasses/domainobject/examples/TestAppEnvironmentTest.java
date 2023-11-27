package com.javafortesters.chap005myownclasses.domainobject.examples;

import org.junit.Test;

import com.javafortesters.domainobject.TestAppEnv;
import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentTest {
    @Test
    public void canGetUrlStatically(){
       assertEquals("Returns Hard Coded URL","http://44.196.170.252:7053/ipmSuite", TestAppEnv.getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically(){
        assertEquals("Returns the Domain only","44.196.170.252", TestAppEnv.DOMAIN);
        assertEquals("Returns the PORT only","7053/ipmSuite",TestAppEnv.PORT);
    }
}

