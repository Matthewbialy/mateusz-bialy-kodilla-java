package com.kodilla.spring.forum;


import org.springframework.stereotype.Component;

@Component
public class ForumUser {

    String userName;

    public String ForumUser(final String userName) {
        this.userName = userName;
        return "John Smith";
    }

    public String getUserName() {
        return "John Smith";
    }
}
