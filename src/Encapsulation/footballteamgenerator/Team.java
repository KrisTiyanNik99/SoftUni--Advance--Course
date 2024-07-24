package Encapsulation.footballteamgenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("A name should not be empty.");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void removePlayer(String s) {
        if (!players.removeIf(e -> e.getName().equals(s))) {
            System.out.printf("Player %s is not in %s team.\n", s, name);
        }
    }

    public double getRating() {
        double sum = players.stream().mapToDouble(Player::overallSkillLevel).sum();
        return sum / players.size();
    }
}
