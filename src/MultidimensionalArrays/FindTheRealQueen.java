package MultidimensionalArrays;

import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = new String[8][8];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
        }

        for (int rows = 0; rows < matrix.length; rows++) {
            String[] currentArr = matrix[rows];

            boolean oneQueenRow = findOneQueenInRow(currentArr);
            // Проверка дали има само една царица на редицата
            if (!oneQueenRow) {
                // Ако са повече от една отиваме директно на следващия ред
                continue;
            }
            // Ако има само една царица на редицата продължаваме и взимаме индекса на който се намира и продължаваме
            int queenColumnIndex = takeQueenPosition(currentArr);

            boolean oneQueenColumn = findOneQueenInColumn(matrix, queenColumnIndex, rows);
            // Проверка дали царицата е единствена в колоната
            if (!oneQueenColumn) {
                continue;
            }

            // Проверка дали царицата е единствената по диагонал
            boolean oneQueenDiagonals = findOneQueenDiagonal(matrix, queenColumnIndex, rows);
            if (oneQueenDiagonals){
                System.out.println(rows + " " + queenColumnIndex);
                return;
            }

        }
    }

    // Метод с който проверявам дали има само една царица на редицата
    private static boolean findOneQueenInRow(String[] currentArr) {
        int findQueen = 0;

        for (String q : currentArr) {

            if ("q".equals(q)) {
                findQueen++;

            }
        }

        return findQueen == 1;
    }

    // Метод който ще се изпълни само ако има по 1 царица на ред и просто връща нейната позиция
    private static int takeQueenPosition(String[] currentArr) {

        int num = 0;
        for (int i = 0; i < currentArr.length; i++) {
            if (currentArr[i].equals("q")) {
                num = i;
                break;
            }
        }

        return num;
    }

    // Метод с който проверяваме дали царицата е единствена в колоната
    private static boolean findOneQueenInColumn(String[][] matrix, int queenColumnIndex, int currentPosition) {

        // Трябва да обходим всички колони и да проверяваме дали на съответната позиция няма друга царица
        for (int i = 0; i < matrix.length; i++) {
            // Проверка дали сегашната позиция на редицата съвпада
            if (i == currentPosition) {
                continue;
            }

            // Можем да сме спокойни дали "queenColumnIndex" го има навсякъде защото по условие матрицата е 8x8
            String currentSymbol = matrix[i][queenColumnIndex];
            if ("q".equals(currentSymbol)) {
                return false;
            }
        }

        return true;
    }

    private static boolean findOneQueenDiagonal(String[][] matrix, int queenColumnIndex, int queenRow) {

        int forSecond = queenColumnIndex;
        int third = forSecond;
        int fourth = third;

        for (int i = queenRow + 1; i < matrix.length; i++) {
            queenColumnIndex ++;
            String first = "";
            if (queenColumnIndex <= matrix[queenRow].length - 1){
                first = matrix[i][queenColumnIndex];
            }else {
                break;
            }

            if (first.equals("q")){
                return false;
            }
        }

        for (int i = queenRow + 1; i < matrix.length; i++) {
            forSecond --;
            String second = "";
            if (forSecond < 0){
                break;
            }else {
                second = matrix[i][forSecond];
            }

            if (second.equals("q")){
                return false;
            }
        }

        for (int i = queenRow - 1; i >= 0; i--) {
            third--;
            String next = "";
            if (third < 0){
                break;
            }else {
                next = matrix[i][third];
            }

            if (next.equals("q")){
                return false;
            }
        }

        for (int i = queenRow - 1; i >= 0; i--) {
            fourth++;
            String next = "";
            if (fourth <= matrix[queenRow].length - 1){
                next = matrix[i][fourth];
            }else {
                break;
            }

            if (next.equals("q")){
                return false;
            }
        }

        return true;
    }
}