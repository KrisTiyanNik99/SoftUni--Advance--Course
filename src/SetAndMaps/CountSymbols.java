package SetAndMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> symbolCount = new TreeMap<>();

        //for (int i = 0; i < text.length(); i++)
        for (char letter : text.toCharArray()){

            symbolCount.putIfAbsent(letter, 0);
            symbolCount.put(letter, symbolCount.get(letter) + 1);
        }

        //for (Map.Entry<Character, Integer> entry : symbolCount.entrySet())
        symbolCount.entrySet().forEach(entry -> System.out.printf("%c: %d time/s\n",
                entry.getKey(), entry.getValue()));
    }
}
