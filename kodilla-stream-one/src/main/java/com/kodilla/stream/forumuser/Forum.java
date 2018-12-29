package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theList = new ArrayList<>();
    public Forum(){
        theList.add(new ForumUser(001,"Oven Nelson", 'M', LocalDate.of(1991,12,12), 32));
        theList.add(new ForumUser(002,"Wiliam Ohara", 'M', LocalDate.of(1881,10,12), 44));
        theList.add(new ForumUser(003, "Nicole Newman", 'F',LocalDate.of(1988,9,12), 12));
        theList.add(new ForumUser(004, "Eddie Morra", 'M',LocalDate.of(1982,03,03), 102));
        theList.add(new ForumUser(005, "Katie Bridge", 'F', LocalDate.of(1978,01,22),22));
        theList.add(new ForumUser(006,"Stuart Baddog", 'M', LocalDate.of(1991,12,31), 99));
        theList.add(new ForumUser(007, "Robie Kean", 'M', LocalDate.of(2001, 11, 11), 32));
        theList.add(new ForumUser(012, "Ann Done", 'F', LocalDate.of(2003,02,02), 112));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theList);
    }
}
