package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> evenNumbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0)
                .toList();

        System.out.println(convertToString(evenNumbers));

        List<Integer> sortedNumbers = evenNumbers.stream()
                .sorted().toList();

        System.out.println(convertToString(sortedNumbers));
    }

    private static String convertToString(List<Integer> evenNumbers) {

        return evenNumbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
