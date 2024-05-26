package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsAndColumns = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rowsAndColumns][rowsAndColumns];

        // Така четем матрици
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        // Понеже матрицата е квадратна и търсим диагоналите ние можем просто да изполваме нарастването на "i"
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        int row = matrix.length - 1;
        int column = 0;
        while (row >= 0 && column < matrix.length) {

            System.out.print(matrix[row][column] + " ");
            row--;
            column++;
        }
    }
}
