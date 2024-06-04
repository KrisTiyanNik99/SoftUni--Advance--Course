package SetAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> tracking = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            String IP = input.split(" ")[0].split("=")[1]; // 192.23.30.41
            String username = input.split(" ")[2].split("=")[1]; // destroyer

            // Проверявам имам ли запис за този потребите
            if (tracking.containsKey(username)) {

                Map<String, Integer> IPAndCount = tracking.get(username);
                if (IPAndCount.containsKey(IP)) {

                    int count = IPAndCount.get(IP) + 1;
                    IPAndCount.put(IP, count);
                } else {
                    IPAndCount.put(IP, 1);
                }
            } else {

                tracking.put(username, new LinkedHashMap<>());
                tracking.get(username).put(IP, 1);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Integer>> entry : tracking.entrySet()) {

            String username = entry.getKey();
            Map<String, Integer> IPAndCounts = entry.getValue();

            //{IP} => {count}
            // .map -> променя от нещо към нещо
            String output = IPAndCounts.entrySet().stream()  // съвкупност от записи
                    .map(IPentry -> String.format("%s => %d", IPentry.getKey(), IPentry.getValue())) // съвкупност от текстове
                    .collect(Collectors.joining(", "));

            System.out.println(username + ":");
            System.out.println(output + ".");
        }
    }
}
