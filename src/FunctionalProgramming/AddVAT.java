package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prices with VAT:");
        DoubleUnaryOperator vat = v -> v * 1.2;

        Arrays.stream(scanner.nextLine().split(", "))
                .mapToDouble(Double::parseDouble)
                .map(vat)
                .forEach(e -> System.out.printf("%.2f%n", e));
    }
}
