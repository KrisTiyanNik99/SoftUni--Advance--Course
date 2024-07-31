package Interfaces.ferrari;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String driverName = scanner.nextLine();
        Car ferrari = new Ferrari(driverName);
        System.out.println(ferrari);
    }
}
