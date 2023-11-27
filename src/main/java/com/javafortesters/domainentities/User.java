package com.javafortesters.domainentities;

public class User {
    private String password;
    private String username;

    /*public User(){ //this is a no argument constructor
    username="admin";
    password="@dm1nROYB";
    }
     */

    public User() { //this is a no argument constructor which calls the constructor with arguments
        this("admin", "@dm1nROYB");
    }

    public User(String username, String password) { // this is a constructor with arguments
        this.username = username;
        this.password = password;
    }

    public String getUsername() { // this is an accessor (getter) method
        return username;
    }

    public String getPassword() { // this is an accessor (getter) method
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   /* public static void setUsername(String username) {
        username = username;
    }*/
}
