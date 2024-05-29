package MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<List<Integer>> matrix = new ArrayList<>();
        fillCrossMatrix(matrix, size);

        String input = scanner.nextLine();
        while (!"Nuke it from orbit".equals(input)){

            String[] tokens = input.split("\\s+");
            int row = Integer.parseInt(tokens[0]);
            int col = Integer.parseInt(tokens[1]);
            int radius = Integer.parseInt(tokens[2]);

            if ((row >= matrix.size() || row < 0) || (col >= matrix.get(row).size() || col < 0)){
                input = scanner.nextLine();
                continue;
            }

            removeAbove(matrix, radius, row, col);
            removeDowns(matrix, radius, row, col);
            removeSides(matrix, radius, row, col);

            matrix.removeIf(List::isEmpty);

            input = scanner.nextLine();
        }

        printCrossMatrix(matrix);
    }

    private static void removeDowns(List<List<Integer>> matrix, int radius, int row, int col) {

        for (int inter = 1; inter <= radius; inter++) {
            if (row + inter < matrix.size()){

                if (col < matrix.get(row + inter).size()) {
                    matrix.get(row + inter).remove(col);
                }
            }else {
                break;
            }
        }
    }

    private static void removeSides(List<List<Integer>> matrix, int radius, int row, int col) {

        for (int actions = 1; actions <= radius; actions++) {

            if (!(col + 1 >= matrix.get(row).size())){
                matrix.get(row).remove(col + 1);
            }else {
                break;
            }
        }

        for (int inter = 1; inter <= radius; inter++) {
            if (col - 1 >= 0){
                matrix.get(row).remove(col - 1);
                col -= 1;
            }else {
                break;
            }
        }

        matrix.get(row).remove(col);
    }

    private static void removeAbove(List<List<Integer>> matrix, int radius, int row, int col) {

        for (int inter = 1; inter <= radius; inter++) {
            if (row - inter < 0){
                break;
            }

            if (col < matrix.get(row - inter).size()){
                matrix.get(row - inter).remove(col);
            }
        }
    }

    private static void printCrossMatrix(List<List<Integer>> matrix) {

        for (List<Integer> list : matrix) {
            for (int element : list){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void fillCrossMatrix(List<List<Integer>> matrix, int[] size) {

        int number = 1;
        for (int rows = 0; rows < size[0]; rows++) {
            matrix.add(new ArrayList<>());
            for (int columns = 0; columns < size[1]; columns++) {
                matrix.get(rows).add(number++);
            }
        }
    }
}