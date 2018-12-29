package com.kodilla.stream;



import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String [] args) {

        ForumUser forumUser = new ForumUser(00111, "Matthew", 'M', LocalDate.of(1991,12,3), 12);
        Forum forum = new Forum();

        Map<Integer, ForumUser> theList = forum.getUserList().stream()
                .filter(forumUser1 -> forumUser.getPosts() > 1)
                .filter(forumUser1 -> forumUser.getSex() == 'M')
                .filter(forumUser1-> forumUser.getDateOfBirth().getDayOfYear() < 1998)
                .collect(Collectors.toMap(ForumUser::getId, forumUser1 -> forumUser ));

                System.out.println("The List Of Users:" + theList.size());
                theList.entrySet().stream()
                        .map(entry-> entry.getKey() + ":" + entry.getValue())
                        .forEach(System.out::println);










    }
}
