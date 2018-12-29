package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int id;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int posts;

    public ForumUser(final int id, final String userName, final char sex, final LocalDate dateOfBirth, final int posts) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "Forum User:" + "ID:" + id + '\n' + "User Name:" + userName + '\n' + "Sex:" + sex +'\n' + "Date of Birth:" + dateOfBirth + '\n' + "Post value:" + posts ;
    }
}
