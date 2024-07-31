package Interfaces.car;

abstract class Peugeot implements Car{
    private String model;
    private String color;
    private int horsePower;

    public Peugeot(String model, String color, int horsePower) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getHorsePower() {
        return null;
    }

    @Override
    public String toString() {
        return "This is %s and have %d tires.".formatted(model, TIERS);
    }

    @Override
    public String countryProduced() {
        return "France";
    }
}
