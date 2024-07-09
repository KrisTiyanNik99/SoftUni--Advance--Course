package Abstractions.cardsuit;

enum CardSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private final int powerSuit;
    CardSuit(int powerSuit) {
        this.powerSuit = powerSuit;
    }

    public int getPowerSuit() {
        return powerSuit;
    }
}
