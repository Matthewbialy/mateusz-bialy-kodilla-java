package com.kodilla.testing.forum;

import com.kodilla.testing.forum.statistics.InterfaceStatistic;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTest {
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


    @Test
    public void getStatisticsTest() {


        int usersCount = 100;
        int postsCount = 1000;
        int commentsCount = 0;

        List<String> list = new ArrayList<>();
        for(int n = 0; n < usersCount; n++) {
            list.add("User" + n);
        }

        InterfaceStatistic statisticsMockito = mock(InterfaceStatistic.class);
        Statistics statistics = new Statistics();


        when(statisticsMockito.postsCount()).thenReturn(postsCount);
        when(statisticsMockito.commentsCount()).thenReturn(commentsCount);
        when(statisticsMockito.usersNames()).thenReturn(list);

        statistics.calculateAdvStatistics(statisticsMockito);

        //When
        double postsAveragePerUser = statistics.getAvgUserPosts();
        double commentsAveragePerUser = statistics.getAvgUserComments();
        double commentsAveragePerPost = statistics.getAvgPostComments();

        //Then
        Assert.assertEquals(1000, postsCount,0.001);
        Assert.assertEquals(0,commentsCount,0.001);
        Assert.assertEquals(100,usersCount,0.001);
        Assert.assertEquals(0,commentsAveragePerUser, 000.1);
        Assert.assertEquals(0,commentsAveragePerPost, 000.1);
        Assert.assertEquals(10,postsAveragePerUser, 0.001);



    }
}

