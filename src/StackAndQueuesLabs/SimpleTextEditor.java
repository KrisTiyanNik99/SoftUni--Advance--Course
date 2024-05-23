package StackAndQueuesLabs;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandNumber = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < commandNumber; i++) {
            String[] command = scanner.nextLine().split(" ");

            switch (command[0]) {
                case "1" -> {
                    String appendedWord = command[1];

                    if (stack.isEmpty()) {
                        stack.push(appendedWord);
                    } else {
                        String newString = stack.peek();
                        newString += appendedWord;

                        stack.push(newString);
                    }
                }
                case "2" -> {
                    int trimNum = Integer.parseInt(command[1]);

                    if (!stack.isEmpty()) {
                        String newString = trimString(stack.peek(), trimNum);
                        stack.push(newString);
                    }
                }
                case "3" -> {
                    int charIndex = Integer.parseInt(command[1]) - 1;

                    if (!stack.isEmpty() && (stack.peek().length() > charIndex)) {
                        System.out.println(stack.peek().charAt(charIndex));
                    }
                }
                case "4" -> {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                }
            }
        }
    }

    private static String trimString(String peek, int trimNum) {

        if (peek.length() > trimNum) {
            int endIndex = peek.length() - trimNum;

            return peek.substring(0, endIndex);
        } else {
            return "";
        }
    }
}