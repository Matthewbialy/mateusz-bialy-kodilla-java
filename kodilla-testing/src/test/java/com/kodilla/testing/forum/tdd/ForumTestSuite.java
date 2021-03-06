package com.kodilla.testing.forum.tdd;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

//Test suite for classes of Forum
public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute com.kodilla.exception.test #" + testCounter);
    }
}