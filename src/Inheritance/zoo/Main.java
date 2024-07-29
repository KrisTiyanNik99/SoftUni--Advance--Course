package Inheritance.zoo;

class Main {
    public static void main(String[] args) {
        Lizard l = new Lizard("Kolio");
        String name = l.getName();
        System.out.println(name);
        System.out.println(l.getNameMod());
    }
}
