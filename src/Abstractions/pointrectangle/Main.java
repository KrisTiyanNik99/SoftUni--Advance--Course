package Abstractions.pointrectangle;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rect = parseRectangle(scanner.nextLine());

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            Point point = parsePoint(scanner.nextLine());
            boolean con = rect.contains(point);
            System.out.println(con);
        }
    }

    private static Point parsePoint(String s) {
        int[] coordinates = takeCoordinates(s);

        return new Point(coordinates[0], coordinates[1]);
    }

    private static Rectangle parseRectangle(String str) {
        int[] coordinates = takeCoordinates(str);

        Point a = new Point(coordinates[0], coordinates[1]);
        Point b = new Point(coordinates[2], coordinates[3]);

        return new Rectangle(a, b);
    }

    private static int[] takeCoordinates(String str) {
        return Arrays.stream(str.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
