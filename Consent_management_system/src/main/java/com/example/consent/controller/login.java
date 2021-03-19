package com.example.consent.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class login {
//    private String username="user1";
//    private String pass="1234";
    @RequestMapping("/welcome")
    public String test(){
        String text="hello";
        return text;
    }
    @RequestMapping("/getUsers")
    public String getUser(){
//        String text="hello";
        return "{\"name\":\"Shruti\"}";
    }
//    public login(String username, String pass) {
//        this.username = username;
//        this.pass = pass;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPass() {
//        return pass;
//    }
//
//    public void setPass(String pass) {
//        this.pass = pass;
//    }

}
