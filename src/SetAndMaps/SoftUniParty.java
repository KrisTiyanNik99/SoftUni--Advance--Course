package SetAndMaps;

import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<String> vip = new TreeSet<>();
        TreeSet<String> regular = new TreeSet<>();

        String input = scanner.nextLine();
        while (!input.equals("PARTY")){

            String reservation = input;

            if (Character.isDigit(input.charAt(0))){
                vip.add(reservation);
            }else {
                regular.add(reservation);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("END")){

            String reservation = input;

            vip.remove(reservation);
            regular.remove(reservation);

            input = scanner.nextLine();
        }

        System.out.println(vip.size() + regular.size());

        for (String viper : vip){
            System.out.println(viper);
        }

        for (String reg : regular){
            System.out.println(reg);
        }
    }
}
