package Encapsulation.shoppingspree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String peopleData = scanner.nextLine();
        String productData = scanner.nextLine();

        List<Person> persons = new ArrayList<>();
        List<Product> products = new ArrayList<>();

        for (String peopleInfo : peopleData.split(";")) {
            String name = peopleInfo.split("=")[0];
            double money = Double.parseDouble(peopleInfo.split("=")[1]);

            Person person = new Person(name, money);
            persons.add(person);
        }

        for (String productInfo : productData.split(";")) {
            String name = productInfo.split("=")[0];
            double cost = Double.parseDouble(productInfo.split("=")[1]);

            Product product = new Product(name, cost);
            products.add(product);
        }

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String personName = command.split("\\s+")[0];
            String productName = command.split("\\s+")[1];

            // Проверяваме дали в списъка има обект, който отговаря на даденото условие
            // products.stream().anyMatch(p -> p.getName().equals(productName))

            Person person = persons.stream().filter(p -> p.getName().equals(personName)).findFirst().get();
            Product product = products.stream().filter(pr -> pr.getName().equals(productName)).findFirst().get();

            person.buyProduct(product);

            command = scanner.nextLine();
        }
    }
}
