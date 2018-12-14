package com.kodilla;


import com.kodilla.testing.collection.Circle;
import com.kodilla.testing.collection.Shape;
import com.kodilla.testing.collection.Square;
import com.kodilla.testing.collection.Triangle;

import java.util.ArrayList;

public class ShapeCollector implements Shape.Shape {

    public static void main(String[] args) {

        ArrayList<Shape> figure = new ArrayList<Shape>();
            figure.add(Circle);
            figure.add(Square);
            figure.add(Triangle);

        ArrayList<Shape> figure1 = new ArrayList<Shape>();
            figure1.remove(Circle);




    }
}
