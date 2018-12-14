package com.kodilla.testing.collection;


import com.kodilla.ShapeCollector;
import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite implements ShapeCollector{
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
        ArrayList<Shape> figureRemove1 = ShapeCollector.removeFigure1();
        System.out.println("List:"+ figureRemove1);

        //Then
        Assert.assertEquals(figureRemove, figureRemove1);

    }

