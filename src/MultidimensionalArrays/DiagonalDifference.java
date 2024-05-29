package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int rows = 0; rows < matrix.length; rows++) {
            matrix[rows] = getCurrentArray(scanner);
        }

        int primaryDiagonal = getPrimaryDiagonal(matrix);
        int secondaryDiagonal = getSecondDiagonal(matrix);

        System.out.println(Math.abs(primaryDiagonal - secondaryDiagonal));
    }

    private static int getPrimaryDiagonal(int[][] matrix) {

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }

    private static int getSecondDiagonal(int[][] matrix) {

        int sum = 0;
        int col = 0;
        for (int row = matrix.length - 1; row >= 0; row--) {
            sum += matrix[row][col];
            col++;
        }

        return sum;
    }

    private static int[] getCurrentArray(Scanner scanner) {

        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}