package MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberOfIndex = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix = new int[numberOfIndex[0]][];

        for (int i = 0; i < matrix.length; i++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = numbers;
        }

        int searchedNumber = Integer.parseInt(scanner.nextLine());

        ArrayList<String> data = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int[] currentArr = matrix[i];

            for (int j = 0; j < currentArr.length; j++) {
                if (currentArr[j] == searchedNumber) {
                    data.add(i + " " + j);
                }
            }
        }

        if (data.isEmpty()) {
            System.out.println("not found");
        } else {
            System.out.println(String.join(System.lineSeparator(), data));
        }
    }
}