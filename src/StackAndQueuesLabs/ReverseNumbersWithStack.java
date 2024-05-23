package StackAndQueuesLabs;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        // int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (String number : numbers) {
            stack.push(number);
        }

        // Вместо да използваме for loop и да създаваме масив и т.н. можем направо на един ред да прочетем и да сложим
        // всички елелемнти от прочетения ред директно в стека по следния начин:
        // Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).forEach(stack::push);

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}