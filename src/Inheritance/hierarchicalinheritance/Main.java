package Inheritance.hierarchicalinheritance;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        dog.getFood("meat");
        System.out.println();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
        cat.getFood("fish");
        System.out.println();

        Animal animal = new Animal();
        animal.getFood("meat");
        System.out.println();

        Mamal mamal = new Mamal();
        mamal.swim();
        mamal.getFood("bread");

        List<Animal> animals = new ArrayList<>();
        // Можем да ги добавяме, защото всички са наследници на класа Animal
        animals.add(dog);
        animals.add(cat);
        animals.add(animal);
        animals.add(mamal);
    }
}
