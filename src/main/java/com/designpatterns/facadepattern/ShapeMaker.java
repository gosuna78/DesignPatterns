package com.designpatterns.facadepattern;

import com.designpatterns.Circle;
import com.designpatterns.Rectangle;
import com.designpatterns.Shape;
import com.designpatterns.Square;

public class ShapeMaker {

    private final Shape circle;
    private final Shape rectangle;
    private final Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

}
