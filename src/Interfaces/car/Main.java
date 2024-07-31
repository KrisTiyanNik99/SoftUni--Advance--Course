package Interfaces.car;

class Main {
    public static void main(String[] args) {
        Car seat = new Seat("Leon", "gray", 110, "Spain");
        Car cit = new Citroen("Black");

        System.out.println(String.format(
                "%s is %s color and have %s horse power",
                seat.getModel(),
                seat.getColor(),
                seat.getHorsePower()));
        System.out.println(seat.toString());

        System.out.println(seat.carPrice());
        System.out.println(seat.TIERS);
        System.out.println(Car.drive(5));
        System.out.println(cit);
    }
}
