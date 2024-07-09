package Abstractions.cardsuit;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        CardRank[] cardRanks = CardRank.values();
//        System.out.println("Card Ranks:");
//        Arrays.stream(cardRanks).forEach(e -> {
//            int cardOrdinary = e.ordinal();
//            System.out.printf("Ordinal value: %d; Name value: %s\n", cardOrdinary, e);
//        });

        CardRank cardRank = CardRank.valueOf(scanner.nextLine());
        CardSuit cardSuit = CardSuit.valueOf(scanner.nextLine());

        Card card = new Card(cardSuit, cardRank);

        System.out.printf("Card name: %s of %s; Card power: %d", cardRank, cardSuit, card.getPower());
    }
}
