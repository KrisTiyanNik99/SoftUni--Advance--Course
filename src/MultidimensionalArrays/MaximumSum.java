package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(input[0]);
        int columns = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int sum = Integer.MIN_VALUE;
        int[][] maxMatrix = new int[2][2];
        for (int row = 0; row < matrix.length - 1; row++) {
            //int[] arr = matrix[i];
            for (int col = 0; col < matrix[row].length - 1; col++) {

                int topLeft = matrix[row][col];
                int topRight = matrix[row][col + 1];

                int bottomLeft = matrix[row + 1][col];
                int bottomRight = matrix[row + 1][col + 1];

                int currentSum = topLeft + topRight + bottomLeft + bottomRight;

                if (currentSum > sum){
                    sum = currentSum;
                    maxMatrix[0][0] = topLeft;
                    maxMatrix[0][1] = topRight;
                    maxMatrix[1][0] = bottomLeft;
                    maxMatrix[1][1] = bottomRight;
                }
            }
        }

        for (int[] arr : maxMatrix){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        System.out.println(sum);
    }
}
