package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void logSettingFile() {
        Logger.getInstance().log("myapp.settings");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //Then
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Last Log:" + lastLog);
        //Then
        Assert.assertEquals("myapp.settings", lastLog);
    }
}
