package ExamLabs.MatrixLabs;

import java.util.Scanner;

public class EscapeTheMaze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[matrixSize][matrixSize];
        fillTheMatrix(matrix, scanner);

        int[] position = findPosition(matrix);
        int myRow = position[0];
        int myCol = position[1];
        int health = 100;
        boolean isExit = false;

        while (health > 0) {
            String command = scanner.nextLine();

            int newRow = myRow;
            int newCol = myCol;

            switch (command) {
                case "up" -> newRow--;
                case "down" -> newRow++;
                case "left" -> newCol--;
                case "right" -> newCol++;
            }

            if (!isValidRow(matrix, newRow) || !isValidCol(matrix, newCol)) {
                continue;
            }

            char symbol = matrix[newRow][newCol];
            switch (symbol) {
                case 'M' -> health -= 40;
                case 'H' -> {
                    health += 15;
                    if (health > 100)
                        health = 100;
                }
                case 'X' -> isExit = true;
            }

            matrix[myRow][myCol] = '-';
            matrix[newRow][newCol] = 'P';
            myRow = newRow;
            myCol = newCol;

            if (isExit) {
                System.out.println("Player escaped the maze. Danger passed!");
                System.out.printf("Player's health: %d units\n", health);
                printAllMatrix(matrix);
                return;
            }
        }

        System.out.println("Player is dead. Maze over!");
        System.out.println("Player's health: 0 units");
        printAllMatrix(matrix);
        System.out.println();
    }

    private static void printAllMatrix(char[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                System.out.print(matrix[rows][cols]);
            }
            System.out.println();
        }
    }

    private static boolean isValidCol(char[][] matrix, int newCol) {
        return newCol >= 0 && newCol < matrix[0].length;
    }

    private static boolean isValidRow(char[][] matrix, int newRow) {
        return newRow >= 0 && newRow < matrix.length;
    }

    private static int[] findPosition(char[][] matrix) {
        int[] position = new int[2];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'P') {
                    position[0] = row;
                    position[1] = col;
                    break;
                }
            }
        }

        return position;
    }

    private static void fillTheMatrix(char[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().toCharArray();
        }
    }
}
