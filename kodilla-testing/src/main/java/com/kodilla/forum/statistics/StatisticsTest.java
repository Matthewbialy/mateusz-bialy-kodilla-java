package com.kodilla.forum.statistics;
import jdk.internal.jline.internal.TestAccessible;
import org.junit.Assert;
import org.junit.Test;
import org.junit.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class StatisticsTest implements Statistics {

    public static void main(String[] args) {
    }

    @Before
    public void before() {

        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }


}

    @Test

    int usersCount = 100;
    int postsCount = 1000;
    int commentsCount = 0;

    List<String> list = new List<>(usersCount);  // ????

    Statistics statisticsMockito = mock (Statistics.class);
    StatisticsTest statisticsTest = new StatisticsTest();

    when(statisticsMockito.getPostCount()).thenReturn(postsCount);
    when(statisticsMockito.getCommentsCount()).thenReturn(commentsCount);
    when(statistocsMockito.getUserName()).thenReturn(list); // ???


    //When
   int StatisticsCalculator =  Statistics.calculateAdvStatistics(statisticsMockito);
   int StatisticsShow = Statistics.showStatistic();

   //Then


}
