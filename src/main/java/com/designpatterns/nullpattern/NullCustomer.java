package com.designpatterns.nullpattern;

public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Customer not available on DB";
    }

}
