package com.javafortesters.chap009arraysandforloopiteration.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayOfUsers {
    @Test
    public void arrayOfUsers() {

        User[] users = new User[3];
        users[0] = new User("admin", "Welcome123");
        users[1] = new User("zibrahim", "Welcome123");
        users[2] = new User("shalabi", "Welcome123");
        assertEquals("admin", users[0].getUsername());
        assertEquals("zibrahim", users[1].getUsername());
        assertEquals("shalabi", users[2].getUsername());
       //System.out.println(users[1].getUsername());

        for(User aUser: users){
            System.out.println(aUser.getUsername());
        }

    }
}