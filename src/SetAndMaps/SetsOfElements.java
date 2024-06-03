package SetAndMaps;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int first = numbers[0];
        int second = numbers[1];

        Set<Integer> firstNumbers = new LinkedHashSet<>();
        for (int i = 0; i < first; i++) {
            firstNumbers.add(Integer.parseInt(scanner.nextLine()));
        }

        Set<Integer> secondNumbers = new LinkedHashSet<>();
        for (int i = 0; i < second; i++) {
            secondNumbers.add(Integer.parseInt(scanner.nextLine()));
        }

        for (int num : firstNumbers){
            if (secondNumbers.contains(num)){
                System.out.print(num + " ");
            }
        }
    }
}
