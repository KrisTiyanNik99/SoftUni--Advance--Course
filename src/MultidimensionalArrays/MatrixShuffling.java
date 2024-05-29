package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        
        String[][] matrix = new String[size[0]][size[1]];
        fillMatrix(matrix, scanner);

        String input = scanner.nextLine();
        while (!"END".equals(input)){

            String[] commands = input.split("\\s+");
            if (commands.length != 5 || !commands[0].equals("swap") || !checkForNumbers(commands)){
                System.out.println("Invalid input!");
                //input = scanner.nextLine();
                //continue;
            }else {
                swapPositionsByIndex(commands, matrix);
            }

            input = scanner.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] arr : matrix) {
            for (String item : arr){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    private static void swapPositionsByIndex(String[] commands, String[][] matrix) {

        int currentRow = Integer.parseInt(commands[1]);
        int currentColumn = Integer.parseInt(commands[2]);

        int swapRow = Integer.parseInt(commands[3]);
        int swapColumn = Integer.parseInt(commands[4]);

        if ((currentRow >= matrix.length || currentRow < 0) || (currentColumn >= matrix[0].length || currentColumn < 0) ||
                (swapRow >= matrix.length || swapRow < 0) || (swapColumn >= matrix[0].length || swapColumn < 0)){

            System.out.println("Invalid input!");
        }else {
            String currentInput = matrix[currentRow][currentColumn];
            matrix[currentRow][currentColumn] = matrix[swapRow][swapColumn];
            matrix[swapRow][swapColumn] = currentInput;

            printMatrix(matrix);
        }
    }

    private static boolean checkForNumbers(String[] commands) {
        try {
            for (int i = 1; i < 5; i++) {
                Integer.parseInt(commands[i]);
            }

            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }
    }
}
