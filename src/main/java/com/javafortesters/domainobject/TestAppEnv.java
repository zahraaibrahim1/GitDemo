package com.javafortesters.domainobject;

public class TestAppEnv {
    public static final String DOMAIN = "44.196.170.252";
    public static final String PORT = "7053/ipmSuite";

    public static String getUrl() {
        return "http://" + DOMAIN + ":" + PORT;
    }

}
