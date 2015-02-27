package com.designpatterns.nullpattern;

public class CustomerFactory {

    public static final String[] names = { "John", "Michael", "Rob" };

    public static AbstractCustomer getCustomer(final String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();

    }
}
