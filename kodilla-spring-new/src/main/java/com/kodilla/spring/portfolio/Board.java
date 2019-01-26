package com.kodilla.spring.portfolio;


public class Board {


    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    private TaskList getToDoList() {
        return toDoList;
    }

    private TaskList getInProgressList() {
        return inProgressList;
    }

    private TaskList getDoneList() {
        return doneList;
    }
}

