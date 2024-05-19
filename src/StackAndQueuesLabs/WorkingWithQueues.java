package StackAndQueuesLabs;

import java.util.ArrayDeque;
import java.util.Scanner;

public class WorkingWithQueues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        ArrayDeque<String> printQueue = new ArrayDeque<>();

        while (!"print".equals(command)) {

            if (command.equals("cancel")) {

                if (printQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printQueue.poll());
                }
            } else {
                printQueue.offer(command);
            }

            command = scanner.nextLine();
        }

        while (!printQueue.isEmpty()) {
            System.out.println(printQueue.poll());
        }
    }
}