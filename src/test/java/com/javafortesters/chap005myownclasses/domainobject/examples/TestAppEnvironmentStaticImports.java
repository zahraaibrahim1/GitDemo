package com.javafortesters.chap005myownclasses.domainobject.examples;

import org.junit.Assert;
import org.junit.Test;

import static com.javafortesters.domainobject.TestAppEnv.*;
import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentStaticImports {

    @Test
    public void canGetUrl(){
        assertEquals("Returns Hard Coded URL","http://44.196.170.252:7053/ipmSuite", getUrl());
    }
    @Test
    public void canGetDomainAndPortStatically(){
        Assert.assertEquals("Returns the Domain only","44.196.170.252", DOMAIN);
        Assert.assertEquals("Returns the PORT only","7053/ipmSuite", PORT);
    }
}
