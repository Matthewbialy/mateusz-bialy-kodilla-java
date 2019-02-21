package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test Hibernate";

    @Test
    public void testFindBYListName() {
        //Given
        TaskList taskList = new TaskList(DESCRIPTION);
        taskListDao.save(taskList);
        //When
        List<TaskList> readTasks = taskListDao.findByListName("Matthew");
        //Then
        Assert.assertTrue(readTasks.isEmpty());
        //CleanUp
        //int id = readTasks.get(0).getId();
        //taskListDao.deleteById(id);
    }
}
