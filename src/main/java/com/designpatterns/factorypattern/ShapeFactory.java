package com.designpatterns.factorypattern;

import com.designpatterns.Circle;
import com.designpatterns.Rectangle;
import com.designpatterns.Shape;
import com.designpatterns.Square;

public class ShapeFactory {

    public Shape getShape(final String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }
}
