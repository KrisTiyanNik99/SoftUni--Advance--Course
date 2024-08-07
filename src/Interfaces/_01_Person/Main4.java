package Interfaces._01_Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Birthable> birthables = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("End")) {

            String[] data = command.split("\\s+");
            switch (data[0]) {
                case "Citizen":
                    String citizenName = data[1];
                    int age = Integer.parseInt(data[2]);
                    String id = data[3];
                    String citizenBirthDate = data[4];

                    Birthable citizen = new Citizen(citizenName, age, id, citizenBirthDate);
                    birthables.add(citizen);
                    break;
                case "Pet":
                    String name = data[1];
                    String birthDate = data[2];

                    Birthable pet = new Pet(name, birthDate);
                    birthables.add(pet);
                    break;
            }

            command = scanner.nextLine();
        }

        String yearOfBirth = scanner.nextLine();
        birthables.stream()
                .filter(b -> b.getBirthDate().endsWith(yearOfBirth))
                .forEach(e -> System.out.println(e.getBirthDate()));
    }
}
