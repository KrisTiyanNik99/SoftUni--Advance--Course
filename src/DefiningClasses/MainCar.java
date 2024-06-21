package DefiningClasses;

import java.util.Scanner;

public class MainCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        while (number-- > 0) {
            String[] info = scanner.nextLine().split("\\s+");

            Car car;
            if (info.length <= 1) {
                car = new Car(info[0]);
            }else {
                car = new Car(info[0], info[1], Integer.parseInt(info[2]));
            }

            System.out.println(car.getInfo());
        }
    }
}
