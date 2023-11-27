package com.javafortesters.chap007basicsofjavarevisited.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassExample {

    public static final String Constant= "a constant string"; // constant field
    public static String aClassField = "a class field"; // class field

    public String pubField= "a public field";

    public ClassExample(String aClassField) {
        this.aClassField = aClassField;
    }
    public String getConstant(){
        return Constant;
    }


}

