package Encapsulation.footballteamgenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] teamInfo = scanner.nextLine().split(";");
        Team team = new Team(teamInfo[1]);

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String command = input.split(";")[0];
            String teamName = input.split(";")[1];

            if (!teamName.equals(team.getName())) {
                System.out.println("Team " + teamName +" does not exist.");
                input = scanner.nextLine();
                continue;
            }

            switch (command) {
                case "Add" -> {
                    //Player p = new Player()
                    //team.addPlayer();
                }
                case "Remove" -> {
                    String playerName = input.split(";")[2];
                    team.removePlayer(playerName);
                }
                case "Rating" -> System.out.println(teamName + " – " + Math.round(team.getRating()));
            }

            input = scanner.nextLine();
        }
    }
}
