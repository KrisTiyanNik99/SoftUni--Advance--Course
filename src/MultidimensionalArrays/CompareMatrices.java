package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        // Правим доказателство, че големината и на двете матрици е еднаква
        boolean isEqual = firstMatrix.length == secondMatrix.length;

        // Аре дължината им е равна проверяваме дали елементите в матрицата са равни
        if (isEqual) {
            // Ако големината им е еднаква, няма значение по коя ще обхождаме
            for (int i = 0; i < firstMatrix.length; i++) {
                // Важно е лементите в матрицата какви са
                int[] firstArr = firstMatrix[i];
                int[] secondArr = secondMatrix[i];

                // Отново проверяваме дали големината на двата масива е еднаква
                isEqual = firstArr.length == secondArr.length;

                // Ако не са равни прекъваме цикъла веднага
                if (!isEqual) {
                    break;
                }

                // Щом не е прекъснат цикъла трябва да проверим дали самите елементи са равни
                if (!isArrEqual(firstArr, secondArr)) {
                    isEqual = false;
                    break;
                }
            }
        }

        String output = isEqual ? "equal" : "not equal";
        System.out.println(output);
    }

    private static boolean isArrEqual(int[] firstArr, int[] secondArr) {

        for (int j = 0; j < firstArr.length; j++) {
            boolean isEqual = firstArr[j] == secondArr[j];
            if (!isEqual)
                return false;
        }

        return true;
    }

    private static int[][] readMatrix(Scanner scanner) {

        int[] numberOfIndex = readArray(scanner);

        int[][] matrix = new int[numberOfIndex[0]][numberOfIndex[1]];

        for (int i = 0; i < matrix.length; i++) {
            //int[] currentArr = readArray(scanner);
            matrix[i] = readArray(scanner);
        }

        return matrix;
    }

    private static int[] readArray(Scanner scanner) {

        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}