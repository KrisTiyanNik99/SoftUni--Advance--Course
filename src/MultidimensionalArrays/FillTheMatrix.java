package MultidimensionalArrays;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int num = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[num][num];

        switch (pattern) {
            case "A" -> matrix = patternA(num);
            case "B" -> matrix = patternB(num);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] patternA(int matrixLength) {

        int[][] matrix = new int[matrixLength][matrixLength];
        for (int i = 0; i < matrix.length; i++) {
            int number = i + 1;

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = number;
                number += matrixLength;
            }
        }

        return matrix;
    }

    private static int[][] patternB(int matrixLength) {

        int[][] matrix = new int[matrixLength][matrixLength];

        int number = 1;
        for (int col = 0; col < matrixLength; col++) {

            if (col % 2 == 0) {
                for (int rows = 0; rows < matrix.length; rows++) {
                    matrix[rows][col] = number++;
                }
            } else {
                for (int rows = matrixLength - 1; rows >= 0; rows--) {
                    matrix[rows][col] = number++;
                }
            }
        }

        return matrix;
    }
}
