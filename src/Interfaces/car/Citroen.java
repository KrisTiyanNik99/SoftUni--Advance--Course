package Interfaces.car;

class Citroen extends Peugeot{
    private static final String MODEL = "Citroen";
    private static final int HORSE_POWER = 65;
    public Citroen(String color) {
        super(MODEL, color, HORSE_POWER);
    }
}
