package com.designpatterns.facadepattern;

public class FacadePatternDemo {

    public static void main(final String[] args) {
        final ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}
