package com.kodilla.testing.collection;


import com.kodilla.ShapeCollector;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite implements ShapeCollector{

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


}

    @Test
    public void testAddFigureName() {
        //Given
        Triangle triangle = new Triangle ();
        Circle circle = new Circle ();
        Square square = new Square ();

        ArrayList<Shape> figureShape = new ArrayList<Shape>();
        figureShape.add(triangle);
        figureShape.add(circle);
        figureShape.add(square);

        //When
        ArrayList<Shape> figureShape1 = ShapeCollector.addFigure();
        System.out.println("Name:" + figureShape1);

        //Then
        Assert.assertEquals(figureShape,figureShape1);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Triangle triangle = new Triangle ();
        Circle circle = new Circle ();
        Square square = new Square ();

        ArrayList<Shape> figureRemove = new ArrayList<Shape>();
        figureRemove.remove(triangle);

        //When
        ArrayList<Shape> figureRemove1 = ShapeCollector.removeFigure();
        System.out.println("List:"+ figureRemove1);

        //Then
        Assert.assertEquals(figureRemove, figureRemove1);

    }

    @Test
    public void testGetFigure() {
        //Given
        Triangle triangle =  new Triangle();
        Circle circle =  new Circle();
        Square square = new Square();

        ArrayList<Shape> getFigure = new ArrayList<>();

        //When
        ArrayList<Shape.Shape> getFigureShape = ShapeCollector.getFigure();

        //Then
        Assert.assertEquals(getFigureShape, getFigure);
    }

