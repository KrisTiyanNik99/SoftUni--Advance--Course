package RegularExam;

import java.util.Scanner;

class Beesy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];
        fillCurrentTheMatrix(scanner, matrix);

        int[] beePosition = findTheBee(matrix);

        int rowBee = beePosition[0];
        int colBee = beePosition[1];

        int beeEnergy = 15;
        boolean resLife = false;
        boolean isExit = false;
        int nectar = 0;

        while (beeEnergy > 0) {
            String command = scanner.nextLine();

            int newRowBee = rowBee;
            int newColBee = colBee;
            // 0, 2
            switch (command) {
                case "up" -> newRowBee--;
                case "down" -> newRowBee++;
                case "left" -> newColBee--;
                case "right" -> newColBee++;
            }

            // -1, 2
            newRowBee = isValidMatrixValue(newRowBee, matrix);
            newColBee = isValidMatrixValue(newColBee, matrix);

            char currentChar = matrix[newRowBee][newColBee];
            if (currentChar == 'H') {
                isExit = true;
            } else if (Character.isDigit(currentChar)) {
                nectar += Integer.parseInt(String.valueOf(currentChar));
            }

            matrix[rowBee][colBee] = '-';
            matrix[newRowBee][newColBee] = 'B';

            beeEnergy--;
            if (isExit) {
                break;
            }

            rowBee = newRowBee;
            colBee = newColBee;

            if (!resLife && nectar > 30 && beeEnergy == 0) {
                beeEnergy = nectar - 30;
                resLife = true;
            }
        }

        if (isExit && nectar >= 30) {
            System.out.println("Great job, Beesy! The hive is full. Energy left: " + beeEnergy);
        }else if (isExit) {
            System.out.println("Beesy did not manage to collect enough nectar.");
        }else {
            System.out.println("This is the end! Beesy ran out of energy.");
        }

        printTheMatrix(matrix);
    }

    private static void printTheMatrix(char[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int col = 0; col < matrix[rows].length; col++) {
                System.out.print(matrix[rows][col]);
            }
            System.out.println();
        }
    }

    private static int isValidMatrixValue(int position, char[][] matrix) {
        if (position >= matrix.length) {
            position = 0;
        } else if (position < 0) {
            position = matrix.length - 1;
        }

        return position;
    }


    private static int[] findTheBee(char[][] matrix) {
        int[] position = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                char current = matrix[i][j];
                if (current == 'B') {
                    position[0] = i;
                    position[1] = j;
                }
            }
        }

        return position;
    }

    private static void fillCurrentTheMatrix(Scanner scanner, char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().toCharArray();
        }
    }
}
