package StackAndQueuesLabs;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] operations = scanner.nextLine().split(" ");
        String[] numbers = scanner.nextLine().split(" ");

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int n = Integer.parseInt(operations[0]);
        for (int i = 0; i < n; i++) {
            queue.offer(Integer.parseInt(numbers[i]));
        }

        int b = Integer.parseInt(operations[1]);
        for (int i = 0; i < b; i++) {
            if (!queue.isEmpty()){
                queue.poll();
            }
        }

        int num = Integer.parseInt(operations[2]);
        if(queue.contains(num)){
            System.out.println("true");
        }else {
            if (queue.isEmpty()){
                System.out.println(0);
            }else {
                System.out.println(Collections.min(queue));
            }
        }
    }
}