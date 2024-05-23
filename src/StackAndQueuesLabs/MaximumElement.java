package StackAndQueuesLabs;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCommands = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer> maxNumbers = new ArrayDeque<>();

        for (int i = 0; i < numCommands; i++) {
            String[] currentCommand = scanner.nextLine().split(" ");

            switch (currentCommand[0]){
                case "1":
                    int currentNumber = Integer.parseInt(currentCommand[1]);
                    stack.push(currentNumber);

                    // Винаги добавяме първото число заедно в "maxNumbers" и в "stack"
                    if (maxNumbers.isEmpty()){
                        maxNumbers.push(currentNumber);
                    }else {
                        if (maxNumbers.peek() < stack.peek()){
                            maxNumbers.push(currentNumber);
                        }
                    }
                    break;
                case "2":
                    // Правим така, че когато единия стек е празен и другия да бъде празен
                    // Когато първото добавено число е едновременно и в 2 стека така спокойно можем да действаме
                    if (!stack.isEmpty()){
                    // Също така е важно да сложим стековете да се изчистват, когато достигнат до първодобавеното число
                        int popedNumber = stack.pop();
                        // Премахваме тогава когато имаме съвпадение на сега премахнатото число с най- голямото срещано
                        if (popedNumber == maxNumbers.peek()){
                        // Поради причината че и в 2 стека първото число е добавено, ако се достигне първото добавено число
                            maxNumbers.pop();
                        // И двата стека ще останат празни, ако ли не в "maxNumbers" винаги ще седи максималното число
                        // Защото или първото добавено число ще е по- голямо от всички останали в "stack" или
                        }
                    }
                    break;
                case "3":

                    if (!maxNumbers.isEmpty()){
                        System.out.println(maxNumbers.peek());
                    }
                    break;
            }
        }
    }
}