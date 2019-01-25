package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testBoardOne() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When & Then
        board.getDoneList();
    }

    @Test
    public void testBoardTwo() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When & Then
        board.getInProgressList();
    }

    @Test
    public void testBoardThree() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When & Then
        board.getToDoList();
    }


    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(TaskList.class);
        TaskList taskList = context.getBean(TaskList.class);
        //When & Then
        taskList.getTasks();
    }
}
