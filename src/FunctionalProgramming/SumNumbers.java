package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .toList();

        System.out.println("Count = " + numbers.size());
        System.out.println("Sum = " +
                numbers.stream()
                        .mapToInt(e -> e)
                        .sum());
    }
}
