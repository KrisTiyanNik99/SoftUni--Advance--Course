package FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class FindSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList();

        Function<List<Integer>, Integer> minNumberFunc = list -> Collections.min(list);

        Integer minNumber = minNumberFunc.apply(names);
        // От нас се иска да принтираме последната позиция на най- малкия елемент в списъка затова използваме "lastIndexOf"
        System.out.println(names.lastIndexOf(minNumber));
    }
}
