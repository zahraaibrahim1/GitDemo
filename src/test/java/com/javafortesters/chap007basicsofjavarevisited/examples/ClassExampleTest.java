package com.javafortesters.chap007basicsofjavarevisited.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassExampleTest {

    @Test
    public void tryConstantField(){
        assertEquals(ClassExample.Constant,"a constant string");
    }
/*    @Test   // Cannot assign a value to final variable Constant
    public void tryToUpdateAConstantField(){
        ClassExample constant = new ClassExample("a constant string");
        constant.Constant="update";
        assertEquals(constant.Constant,"update");

    }*/
@Test
public void tryToGetConstant(){
    ClassExample constant= new ClassExample("a constant string");
    assertEquals(constant.getConstant(),"a constant string");
}
    @Test
    public void tryClassField() {
        assertEquals(ClassExample.aClassField, "a class field");
    }

    @Test
    public void updateAClassField(){

        ClassExample instance = new ClassExample("a class field");
        instance.aClassField= "changed";
        assertEquals(instance.aClassField,"changed");
    }
@Test
    public void tryPublicField(){
    ClassExample instance= new ClassExample("a public field");
    assertEquals(instance.pubField, "a public field");
    instance.pubField="amended public field";
    assertEquals(instance.pubField, "amended public field");
}
}