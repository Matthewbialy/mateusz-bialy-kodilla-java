package com.kodilla.testing.shape;


import com.kodilla.testing.collection.*;
import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    public static void main(String[] args) {
    }

    @Before
    public void before() {

        System.out.println("Test Case: begin");
    }

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }


    @Test
    public void testAddFigureName() {
        //Given
        Triangle triangle = new Triangle(3.0, 1.5);
        Circle circle = new Circle(4);
        Square square = new Square(5);

        ShapeCollector sc = new ShapeCollector();


        //When
        sc.addFigure(triangle);

        //Then
        Assert.assertEquals(triangle, sc.getFigure(0));
    }

    @Test
    public void testRemoveFigure() {

        //Given
        ShapeCollector shape = new ShapeCollector();
        Circle circle = new Circle(4);
        shape.addFigure(circle);

        //When
        shape.removeFigure(circle);

        //Then
        Assert.assertNotNull(shape);


    }
}

