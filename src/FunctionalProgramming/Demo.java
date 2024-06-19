package FunctionalProgramming;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        //String operation = scanner.nextLine();

        Stream<Integer> integerStream = list.stream()
                .filter(e -> {
                    System.out.println("Predicate checking: " + e);

                    //boolean test = operation.equals("even") ? e % 2 == 0 : e % 2 != 0;
                    return e % 2 == 0;
                })
                .map(e -> {
                   System.out.println("Mapping: "+ e);
                    return e;
                });

        System.out.println("Line");

        List<Integer> num = integerStream.toList();
        System.out.println(num);
    }
}
