package DefiningClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> bank = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            String out = "";
            switch (command) {
                case "Create" -> {
                    // Създаваме банков акаунт
                    BankAccount account = new BankAccount();
                    // Слагаме го директно в мапа "bank" като id-то се инкрементира в самия клас "BankAccount"
                    bank.put(account.getId(), account);
                    out = "Account ID" + account.getId() + " created";
                }
                case "Deposit" -> {
                    int id = Integer.parseInt(tokens[1]);
                    double amount = Double.parseDouble(tokens[2]);

                    if (bank.containsKey(id)) {
                        BankAccount account = bank.get(id);
                        account.deposit(amount);

                        out = "Deposited " + amount + " to ID" + id;
                    } else {
                        out = "Account does not exist";
                    }
                }
                case "SetInterest" -> {
                    double interest = Double.parseDouble(tokens[1]);
                    BankAccount.setInterestRate(interest);
                }
                case "GetInterest" -> {
                    int id = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);

                    if (bank.containsKey(id)) {
                        BankAccount account = bank.get(id);
                        double interest = account.getInterestRate(years);

                        out = String.format("%.2f", interest);
                    } else {
                        out = "Account does not exist";
                    }
                }
            }

            if (!out.isEmpty()) {
                System.out.println(out);
            }

            input = scanner.nextLine();
        }
    }
}
