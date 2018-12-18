package com.kodilla;


import com.kodilla.testing.collection.Circle;
import com.kodilla.testing.collection.Shape;
import com.kodilla.testing.collection.Square;
import com.kodilla.testing.collection.Triangle;

import java.util.ArrayList;

public class ShapeCollector implements Shape {

    public static void main(String[] args) {


        private Shape shape;

       public ShapeCollector(Shape shape) {
            this.shape = shape;
        }

        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        ArrayList<Shape> figureList = new ArrayList<>();

        public void addFigure (Shape shape){
            figureList.add(shape);
        }
        public void removeFigure (Shape shape){
            figureList.remove(shape);
        }
        public void getFigure (int n){
            figureList.get(n);
        }

    }

    protected static ArrayList<Shape> removeFigure() {
    }
    protected static ArrayList<Shape> addFigure() {
    }
    protected static ArrayList<Shape> getFigure() {
    }
