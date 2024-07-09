package Abstractions.trafficlights;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Light[] lights = Arrays.stream(scanner.nextLine().split("\\s+"))
                                .map(Light::valueOf)
                                .toArray(Light[]::new);

        int numOfUpdates = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfUpdates; i++) {
            // Update lights
            updateLights(lights);
            // Print lights
            printLights(lights);
        }
    }

    private static void printLights(Light[] lights) {

        for (Light light : lights) {
            System.out.print(light + " ");
        }
        System.out.println();
    }

    private static void updateLights(Light[] lights) {

        // Не работим с "forEach" защото той използва копия на реалните стойности
        for (int index = 0; index < lights.length; index++) {
            switch (lights[index]) {
                case RED -> lights[index] = Light.GREEN;
                case GREEN -> lights[index] = Light.YELLOW;
                case YELLOW -> lights[index] = Light.RED;
            }
        }
    }
}
