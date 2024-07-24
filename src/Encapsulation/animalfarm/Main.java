package Encapsulation.animalfarm;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int ageChicken = Integer.parseInt(scanner.nextLine());

        Chicken chicken = new Chicken(name, ageChicken);

        System.out.println(chicken);
    }
}
