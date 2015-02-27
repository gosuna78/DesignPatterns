package com.designpatterns.nullpattern;

public class NullPatternDemo {

    public static void main(final String[] args) {
        final AbstractCustomer customer1 = CustomerFactory.getCustomer("John");
        final AbstractCustomer customer2 = CustomerFactory.getCustomer("Michael");
        final AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
 
    }

}
