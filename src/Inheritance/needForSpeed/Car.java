package Inheritance.needForSpeed;

class Car extends Vehicle{
    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        setFuelConsumption(3);
    }

    @Override
    public void test() {
        System.out.println("From Car");
    }
}
