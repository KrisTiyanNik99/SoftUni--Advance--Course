package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row = num[0];
        int col = num[1];

        int[][] matrix = new int[row][col];

        for (int rows = 0; rows < matrix.length; rows++) {
            matrix[rows] = getArray(scanner);
        }

        int sum = Integer.MIN_VALUE;
        int rowMax = 0;
        int columnMax = 0;
        for (int rows = 0; rows < matrix.length - 2; rows++) {
            for (int colum = 0; colum < matrix[rows].length - 2; colum++) {
                int currentMatrixSum = getSum(matrix, rows, colum);

                if (currentMatrixSum > sum) {
                    sum = currentMatrixSum;
                    rowMax = rows;
                    columnMax = colum;
                }
            }
        }

        System.out.println("Sum = " + sum);
        for (int i = rowMax; i <= rowMax + 2; i++) {
            for (int j = columnMax; j <= columnMax + 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int getSum(int[][] matrix, int rows, int colum) {
        int sum = 0;
        for (int i = rows; i <= rows + 2; i++) {
            for (int j = colum; j <= colum + 2; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    private static int[] getArray(Scanner scanner) {

        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
