package Encapsulation.firstandreserveteam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name) {
        this.name = name;
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Person person) {
        if (person.getAge() < 40) {
            firstTeam.add(person);
            return;
        }

        reserveTeam.add(person);
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(firstTeam);
    }

    public List<Person> getReserveTeam() {
        // Това не работи - List<Person> newTeam = reserveTeam;
        return Collections.unmodifiableList(reserveTeam);
    }
}
