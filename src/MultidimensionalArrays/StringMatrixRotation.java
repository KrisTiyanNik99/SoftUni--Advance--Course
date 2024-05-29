package MultidimensionalArrays;

import java.util.*;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotationAngle = scanner.nextLine().replace("Rotate(", "").replace(")", "");
        int rotation = Integer.parseInt(rotationAngle) / 90;

        List<String> words = new ArrayList<>();
        String word = scanner.nextLine();
        while (!word.equals("END")){

            words.add(word);

            word = scanner.nextLine();
        }

        int rows = words.size();
        int columns = Collections.max(words, Comparator.comparing(String::length)).length();
        char[][] matrix = new char[rows][columns];

        fillMatrix(matrix, words);

        for (int rotations = 1; rotations <= rotation; rotations++) {
            matrix = rotateMatrix(matrix);
        }

        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar + "");
            }
            System.out.println();
        }
    }

    private static char[][] rotateMatrix(char[][] matrix) {

        int newRow = matrix[0].length;
        int newCol = matrix.length;
        char[][] newMatrix = new char[newRow][newCol];

        for (int i = 0; i < matrix[0].length; i++) {

            int newMatrixColumn = 0;
            for (int j = matrix.length - 1; j >= 0; j--) {
                newMatrix[i][newMatrixColumn] = matrix[j][i];
                newMatrixColumn++;
            }
        }

        return newMatrix;
    }

    private static void fillMatrix(char[][] matrix, List<String> words) {

        for (int row = 0; row < matrix.length; row++) {
            String word = words.get(row);

            for (int col = 0; col < matrix[row].length; col++) {

                if (col <= word.length() - 1){
                    matrix[row][col] = word.charAt(col);
                }else {
                    matrix[row][col] = ' ';
                }
            }
        }
    }
}
