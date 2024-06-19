package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).toList();

        //Predicate<String> predicate = e -> e.length() > num;
        Predicate<String> predicate = e -> e.length() <= num;

        //names.removeIf(predicate);
        names.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}
