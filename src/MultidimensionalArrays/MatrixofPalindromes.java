package MultidimensionalArrays;

import java.util.Scanner;

public class MatrixofPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int col = scanner.nextInt();

        String[][] matrix = new String[rows][col];

        for (int row = 0; row < matrix.length; row++) {
            for (int cols = 0; cols < matrix[row].length; cols++) {
                char letter = (char) (97 + row);
                char currentLetter = (char) (97 + row + cols);

                String palindrome = String.format("%c%c%c", letter, currentLetter, letter);
                matrix[row][cols] = palindrome;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}