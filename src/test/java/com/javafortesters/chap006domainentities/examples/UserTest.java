package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canConstructANewUser() {
        User user = new User();
    }

    @Test
    public void userHasDefaultUsernameAndPassword(){
        User user = new User();
        assertEquals("default username expected",
                "admin",
                user.getUsername());
        assertEquals("default password expected",
                "@dm1nROYB",
                user.getPassword());
    }

    @Test
    public void userHasUsernameAndPassword(){
        User user= new User("zibrahim","Welcome123");
        assertEquals("Given username expected",
                "zibrahim",
                user.getUsername());
        assertEquals("Given password expected",
                "Welcome123",
                user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstruction(){
        User user= new User();
        user.setPassword("Welcome123");
        assertEquals("default password expected",
                "Welcome123",
                user.getPassword());
    }
}
