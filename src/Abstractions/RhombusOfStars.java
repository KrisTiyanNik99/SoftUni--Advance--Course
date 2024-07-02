package Abstractions;

import java.util.Scanner;

class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printTopTrianglePart(n);
        printBottomTrianglePart(n);
    }

    private static void printBottomTrianglePart(int n) {
        for (int i = 1; i < n; i++) {
            printRow(" ", i);
            printRow("* ", n - i);
            System.out.println();
        }
    }

    private static void printTopTrianglePart(int n) {
        for (int i = 1; i <= n; i++) {
//            for (int j = 0; j < n - i; j++) {
//                System.out.print(" ");
//            }
            printRow(" ", n - i);

//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
            printRow("* ", i);
            System.out.println();
        }
    }

    private static void printRow(String str, int reps) {
        for (int i = 0; i < reps; i++) {
            System.out.print(str);
        }
    }
}
