package SetAndMaps;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        TreeMap<String, Double[]> students = new TreeMap<>();

        for (int i = 0; i < num; i++) {
            String name = scanner.nextLine();
            String[] score = scanner.nextLine().split(" ");
            Double[] gradues = new Double[score.length];
            gradues = fillGradues(score, gradues);

            students.put(name, gradues);
        }

        DecimalFormat df = new DecimalFormat("0.################");

        for (Map.Entry<String, Double[]> entry : students.entrySet()){
            double average = 0;
            String name = entry.getKey();
            Double[] currentGradues = entry.getValue();

            for (int i = 0; i < currentGradues.length; i++) {
                average += currentGradues[i];
            }

            average /= currentGradues.length;
            String formattedAverage = df.format(average);
            System.out.printf("%s is graduated with %s\n", name, formattedAverage);
        }
    }

    private static Double[] fillGradues(String[] score, Double[] gradues) {

        for (int i = 0; i < score.length; i++) {
            gradues[i] = Double.parseDouble(score[i]);
        }

        return gradues;
    }
}
