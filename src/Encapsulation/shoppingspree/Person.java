package Encapsulation.shoppingspree;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }

        this.money = money;
    }

    public void buyProduct(Product p) {
        if (p.getCost() > money) {
            //String message = "%s can't afford %s".formatted(name, p.getName());
            System.out.printf("%s can't afford %s\n", name, p.getName());
            return;
        }

        money -= p.getCost();
        products.add(p);
        System.out.printf("%s bought %s\n", name, p.getName());
    }

    public String getName() {
        return name;
    }
}
