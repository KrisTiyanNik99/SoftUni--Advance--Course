package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                                    .map(Integer::parseInt)
                                    .collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> addNumber = num -> num.stream()
                                                                     .map(n -> n + 1)
                                                                     .collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> multiNumber = num -> num.stream()
                                                                       .map(n -> n * 2)
                                                                       .collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> subNumber = num -> num.stream()
                                                                     .map(n -> n - 1)
                                                                     .collect(Collectors.toList());


        String command = scanner.nextLine();
        while (!command.equals("end")) {

            switch (command) {
                case "add" -> numbers = addNumber.apply(numbers);
                case "multiply" -> numbers = multiNumber.apply(numbers);
                case "subtract" -> numbers = subNumber.apply(numbers);
                case "print" -> {
                    numbers.forEach(e -> System.out.print(e + " "));
                    System.out.println();
                }
            }

            command = scanner.nextLine();
        }
    }

//    private static Function<List<Integer>, List<Integer>> getFunction(String command) {
//
//        return switch (command) {
//            case "add" -> list -> list.stream()
//                                        .map(n -> n + 1)
//                                        .collect(Collectors.toList());
//            case "multiply" -> list -> list.stream()
//                                            .map(n -> n * 2)
//                                            .collect(Collectors.toList());
//            case "subtract" -> list -> list.stream()
//                                            .map(n -> n - 1)
//                                            .collect(Collectors.toList());
//
//            default -> throw new IllegalStateException("Unexpected value: " + command);
//        };
//    }
}
