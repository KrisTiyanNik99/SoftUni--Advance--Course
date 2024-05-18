package StackAndQueuesLabs;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Взимаме израза
        String expression = scanner.nextLine();
        // Създаваме стек който да пази индексите на които среща отварящи скоби
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            // Взимаме всеки отделен символ и го проверяваме какъв е
            char symbol = expression.charAt(i);

            switch (symbol){
                case '(':
                    stack.push(i);
                    break;

                // При всекя първо срещната затваряща скоба взимаме последната отваряща
                case ')':
                    // По този начин израза винаги си взима от момента на отварянето, до затварянето символите
                    int startIndex = stack.pop();
                    // Винаги последно добавената скоба трябва да е затваря израза при първовъзможната затваряща скоба
                    int endIndex = i + 1;
                    String content = expression.substring(startIndex, endIndex);
                    System.out.println(content);
                    break;
            }
        }
    }
}
