package SetAndMaps;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        Set<String> chemicalElements = new TreeSet<>();
        for (int i = 0; i < num; i++) {
            // Можем да запазим цяла колекция към сетовете
            String[] compounds = scanner.nextLine().split("\\s+");
            // С "List.of()" създаваме колекция от дадения елемент - масивите са по- специфична колекция
            chemicalElements.addAll(List.of(compounds));
            // Поради тази причина за да можем да ги добавим с метода "addAll" трябва да ги превърнем първо в списък
        }

        chemicalElements.forEach(element -> System.out.print(element + " "));
    }
}