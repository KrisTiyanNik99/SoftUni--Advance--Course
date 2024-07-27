package Abstractions;

import Abstractions.oop.Goat;
//import Abstractions.oop.Mini;

class Main {
    public static void main(String[] args) {
        Goat goat = new Goat("Kris", 55);
        //Mini mini = new Mini("Miko", 67);

        goat.scary();
        //mini.scary();
    }
}
