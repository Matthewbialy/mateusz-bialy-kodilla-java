package com.kodilla.testing.collection;


import java.util.ArrayList;

public class ShapeCollector  {


    private ArrayList<Shape> figureList = new ArrayList<>();


    public void addFigure(Shape shape) {
        figureList.add(shape);
    }

    public void removeFigure(Shape shape) {
        figureList.remove(shape);
    }

    public Shape getFigure(int n) {
       return figureList.get(n);
    }

    public int checkFigureList (Shape shape){
        return figureList.size();
    }
}
