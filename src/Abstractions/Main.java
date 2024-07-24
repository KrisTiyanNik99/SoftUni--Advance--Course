package Abstractions;

import Abstractions.oop.Goat;

class Main {
    public static void main(String[] args) {
        Goat goat = new Goat("Kris", 55);
        System.out.println(goat.getName());
        goat.printAnimal();
    }
}
