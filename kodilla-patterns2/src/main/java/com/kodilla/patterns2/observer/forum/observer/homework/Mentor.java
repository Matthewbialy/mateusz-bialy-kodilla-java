package com.kodilla.patterns2.observer.forum.observer.homework;

import java.util.Map;

public class Mentor implements Observer {

    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;

    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(Student student) {
        Map<String, String> homework = student.getHomeworks();
        String lastKey = "";
        for (String entry : homework.keySet()) {
            lastKey = entry;
        }


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Student ");
        stringBuilder.append(student.getSurname());
        stringBuilder.append(" from ");
        stringBuilder.append(student.getCourseName());
        stringBuilder.append(" course send new homework:\n");
        stringBuilder.append(lastKey);
        System.out.println(stringBuilder);
        updateCount++;
    }

}
