package StackAndQueuesLabs;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(" ");
        int count = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> players = new ArrayDeque<>();

        // Преминаваме през всички играчи и ги добавяме във for loop
        for (String player : names) {
            players.offer(player);
        }

        // След което завъртаме while loop докато не ни остане само един играч в опашката
        while (players.size() > 1){
            // Преминаваме през всички играещи докато не достигнем бройката, която ни е зададена
            for (int i = 1; i < count; i++) {
                // Премахваме първия добавен ирач
                String firstAddedPlayer = players.poll();
                // Слагаме "firstAddedKid" най-отзаде на опашката
                players.offer(firstAddedPlayer);
            }

            // Премахваме първодобавеният играч като тук вече смаляваме и размера на опашката
            System.out.println("Removed " + players.poll());
        }

        // Принтираме последния останал играч
        System.out.println("Last is " + players.poll());
    }
}