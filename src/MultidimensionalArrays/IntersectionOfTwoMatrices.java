package MultidimensionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        String[][] firstMatrix = createMatrix(first, second, scanner);
        String[][] secondMatrix = createMatrix(first, second, scanner);

        for (int i = 0; i < firstMatrix.length; i++) {
            //String[] currentFirstArr = firstMatrix[i];
            //String[] currentSecondArr = secondMatrix[i];

            for (int j = 0; j < secondMatrix[i].length; j++) {
                String fromFirstMatrixLetter = firstMatrix[i][j];
                String fromSecondMatrixLetter = secondMatrix[i][j];

//                if (fromFirstMatrixLetter.equals(fromSecondMatrixLetter)){
//                    System.out.print(fromFirstMatrixLetter + " ");
//                }else {
//                    System.out.print("* ");
//                }

                System.out.print(fromFirstMatrixLetter.equals(fromSecondMatrixLetter) ? fromFirstMatrixLetter + " " : "* ");
            }

            System.out.println();
        }
    }

    private static String[][] createMatrix(int first, int second, Scanner scanner) {

        String[][] matrix = new String[first][second];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = getNumbersFromLine(scanner);
        }

        return matrix;
    }

    private static String[] getNumbersFromLine(Scanner scanner) {

        return scanner.nextLine().split("\\s+");
    }
}