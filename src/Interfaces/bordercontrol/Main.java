package Interfaces.bordercontrol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Identifiable> individuals = new ArrayList<>();
        String command = scanner.nextLine();
        while (!command.equals("END")){
            String[] individualData = command.split("\\s+");

            Identifiable individual;
            if (individualData.length == 2){
                String model = individualData[0];
                String id = individualData[1];
                 individual = new Robot(model, id);
            }else {
                String name = individualData[0];
                int age = Integer.parseInt(individualData[1]);
                String id = individualData[2];
                individual = new Citizen(name, age, id);
            }

            individuals.add(individual);
            command = scanner.nextLine();
        }

        String idSuffix = scanner.nextLine();

        individuals.stream()
                .filter(individual -> individual.getId().endsWith(idSuffix))
                .forEach(id -> System.out.println(id.getId()));
    }
}
