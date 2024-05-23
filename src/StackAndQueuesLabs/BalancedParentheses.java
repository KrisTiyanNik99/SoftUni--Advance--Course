package StackAndQueuesLabs;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Character> stack = new ArrayDeque<>();
        String parenthesis = scanner.nextLine();

        for (char symbol : parenthesis.toCharArray()) {

            if (symbol == '(' || symbol == '{' || symbol == '['){
                stack.push(symbol);
            }else {
                if (stack.isEmpty() || !areMatchingParenthesis(stack.pop(), symbol)){
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }

    private static boolean areMatchingParenthesis(char pop, char symbol) {

        if (pop == '['){
            return symbol == ']';
        }else if (pop == '('){
            return symbol ==  ')';
        }else {
            return symbol == '}';
        }
    }
}