package SetAndMaps;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstPlayer = getCards(scanner);
        LinkedHashSet<Integer> secondPlayer = getCards(scanner);

        int rounds = 50;
        while (rounds-- > 0 && !firstPlayer.isEmpty() && !secondPlayer.isEmpty()) {

            int firstPlayerCard = getPlayerCard(firstPlayer);
            firstPlayer.remove(firstPlayerCard);

            int secondPlayerCard = getPlayerCard(secondPlayer);
            secondPlayer.remove(secondPlayerCard);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayer.add(firstPlayerCard);
                firstPlayer.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayer.add(firstPlayerCard);
                secondPlayer.add(secondPlayerCard);
            }
        }

        if (firstPlayer.size() == secondPlayer.size()) {
            System.out.println("Draw!");
        } else if (firstPlayer.size() > secondPlayer.size()) {
            System.out.println("First player win!");
        } else {
            System.out.println("Second player win!");
        }
    }

    private static int getPlayerCard(LinkedHashSet<Integer> cards) {
        for (Integer n : cards) {
            return n;
        }

        return 0;
    }

    private static LinkedHashSet<Integer> getCards(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
