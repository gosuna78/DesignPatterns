package com.designpatterns.singletonpattern;

public class SingletonPatternDemo {
    public static void main(final String[] args) {
        // Get the only object available
        final SingleObject object = SingleObject.getInstance();
        // show the message
        object.showMessage();
        final SingleObject object2 = SingleObject.getInstance();
        object2.showMessage();
    }
}
