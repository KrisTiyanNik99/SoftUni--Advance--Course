package Abstractions.cardsuit;

class Card {
    private int power;

    public Card(CardSuit cardSuit, CardRank cardRank) {
        this.power = cardSuit.getPowerSuit() + cardRank.getPower();
    }

    public int getPower() {
        return power;
    }
}
