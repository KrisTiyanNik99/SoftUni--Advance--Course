package Interfaces._05_Telephony;

import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] phoneNumbers = scanner.nextLine().split("\\s+");
        String[] urls = scanner.nextLine().split("\\s+");

        Smartphone smartphone = new Smartphone(List.of(phoneNumbers), List.of(urls));
        smartphone.call();
        smartphone.browse();
    }
}
