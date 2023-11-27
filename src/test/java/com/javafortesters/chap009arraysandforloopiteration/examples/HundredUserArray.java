package com.javafortesters.chap009arraysandforloopiteration.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HundredUserArray {
    @Test
    public void hundredUserArray() {
        User[] user = new User[100];

        for (int index = 0; index < 100; index++) {
            int i= index+1;
            user[index] = new User("user" + i, "password" + i);

        }

        for (User usher :
                user) {
                System.out.println(usher.getUsername()+","+usher.getPassword());
        }

        int userId = 1;
        for(User aUser : user){
            assertEquals("user" + userId, aUser.getUsername());
            assertEquals("password" + userId, aUser.getPassword());
            userId++;
        }
    }
}
