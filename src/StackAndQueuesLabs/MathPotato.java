package StackAndQueuesLabs;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] playerNames = scanner.nextLine().split(" ");
        int count = Integer.parseInt(scanner.nextLine());

        // Подреждаме играчите спрямо имената им
        PriorityQueue<String> players = new PriorityQueue<>();

        for (String name : playerNames) {
            players.offer(name);
        }

        int cycle = 1;
        while (players.size() > 1) {

            for (int i = 1; i < count; i++) {
                String player = players.poll();
                players.offer(player);
            }

            // Проверка дали числото е просто
            if (isPrime(cycle)) {
                // Ако е просто само отпечатваме кой е наред
                System.out.println("Prime " + players.peek());
            } else {
                // Ако числото не е просто премахваме играча
                System.out.println("Removed " + players.poll());
            }

            // Увеличаваме числото с 1
            cycle++;
        }

        // Принтираме и последния останал играч
        System.out.println("Last is " + players.poll());
    }

    // Метод за проверка дали числото е просто или не
    private static boolean isPrime(int number){

        boolean isPrimeNumber = true;
        for (int i = 2; i < number; i++) {

            if (number % i == 0){
                isPrimeNumber = false;
                break;
            }
        }

        if (number == 1){
            return false;
        }

        return isPrimeNumber;
    }
}