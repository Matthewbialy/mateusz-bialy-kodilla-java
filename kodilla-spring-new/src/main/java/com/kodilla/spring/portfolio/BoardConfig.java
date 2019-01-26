package com.kodilla.spring.portfolio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
            @Qualifier("taskList1")
            TaskList getInProgressList;

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    @Bean
    public Board getBoard() {
        return new Board(doneList, toDoList, inProgressList);
    }

    @Bean(name = "taskList1")
    @Scope("prototype")
    public TaskList getTaskList() { return new TaskList(getBoard().getInProgressList().tasks);
    }

    @Bean(name = "taksList2")
    @Scope("prototype")
    public TaskList getTaskListTwo() {
        return new TaskList(getBoard().getDoneList().tasks);
    }

    @Bean(name = "taksList3")
    @Scope("prototype")
    public TaskList getTaskListThree() {
        return new TaskList(getBoard().getToDoList().tasks);
    }


}

