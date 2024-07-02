package Abstractions.hotelreservations;

public enum Season {
    SPRING(2),
    SUMMER(4),
    AUTUMN(1),
    WINTER(3);

    private final int multiplayer;
    Season(int multiplayer) {
        this.multiplayer = multiplayer;
    }

    public int getMultiplayer() {
        return multiplayer;
    }
}
