package StackAndQueuesLabs;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> binaryDigits = new ArrayDeque<>();

        if (number == 0) {
            System.out.print(0);
        }

        while (number != 0){

            binaryDigits.push(number % 2);
            number /= 2;
        }

        while (!binaryDigits.isEmpty()){
            System.out.print(binaryDigits.pop());
        }
    }
}