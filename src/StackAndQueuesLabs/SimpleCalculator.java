package StackAndQueuesLabs;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Изрязваме празните пространства между израза и запазваме само чистия израз с цифрите и операторите
        String[] token = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();

        // Обръщаме масива и го записваме в стека за да може после да си започнем с решаването на израза отпред назад
        for (int i = token.length - 1; i >= 0; i--) {
            stack.push(token[i]);
        }

        // Въртим докато не остане само 1 число в стека
        while (stack.size() > 1) {
            int firstNumber = Integer.parseInt(stack.pop());
            String operation = stack.pop();
            int secondNumber = Integer.parseInt(stack.pop());

            // Проверка за кой иператор използваме в момента
            switch (operation) {
                // След всяко действие според проверката, добавяме новополученото число към стека
                case "+":
                    stack.push(String.valueOf(firstNumber + secondNumber));
                    break;
                case "-":
                    stack.push(String.valueOf(firstNumber - secondNumber));
                    break;
            }
        }

        // Принтираме крайния резултат
        System.out.print(stack.pop());
    }
}