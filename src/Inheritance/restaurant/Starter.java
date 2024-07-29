package Inheritance.restaurant;

import java.math.BigDecimal;

class Starter extends Food{
    public Starter(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }
}
