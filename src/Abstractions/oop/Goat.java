package Abstractions.oop;

public class Goat extends Animal{

    public Goat(String name, int weight) {
        super(name, weight, "Goat");
    }

    @Override
    public String getName() {
        return super.getName() + " is " + getKind();
    }
}
