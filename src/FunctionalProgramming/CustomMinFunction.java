package FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                                .map(Integer::parseInt)
                                .toList();

        Function<List<Integer>, Integer> minNumber = l -> Collections.min(l);

        Integer number = minNumber.apply(names);
        System.out.println(number);
    }
}
