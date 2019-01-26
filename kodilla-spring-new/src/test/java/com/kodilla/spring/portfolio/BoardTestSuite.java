package com.kodilla.spring.portfolio;

import org.junit.Assert;
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
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        TaskList taskList1 = board.getToDoList();
        taskList1.getTasks().add("first task");
        System.out.println(taskList1);

        TaskList taskList2 = board.getDoneList();
        taskList2.getTasks().add("secound task");
        System.out.println(taskList2);

        TaskList taskList3 = board.getInProgressList();
        taskList3.getTasks().add("third task");
        System.out.println(taskList3);
        //Then
        Assert.assertTrue(taskList1.getTasks().isEmpty());

    }
}
