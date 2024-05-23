package StackAndQueuesLabs;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] index = scanner.nextLine().split(" ");
        String[] numbers = scanner.nextLine().split(" ");

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }

        int popedElements = Integer.parseInt(index[1]);
        for (int i = 0; i < popedElements; i++) {
            stack.pop();

            if (stack.isEmpty()){
                System.out.println(0);
                return;
            }
        }

        String searchedElement = index[2];
        if (stack.contains(searchedElement)){
            System.out.println("true");
        }else {
            int smallestNum = Integer.MAX_VALUE;
            for (int i = 0; i < stack.size(); i++) {
                int currentNumber = Integer.parseInt(stack.pop());

                if (smallestNum > currentNumber){
                    smallestNum = currentNumber;
                }
            }
            // Можем да намерим най- малката стойност и чрез следния ред код:
            // Collections.min(stack);
            System.out.println(smallestNum);
        }
    }
}
