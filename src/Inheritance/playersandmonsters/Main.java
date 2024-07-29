package Inheritance.playersandmonsters;

class Main {
    public static void main(String[] args) {
        Hero h = new Hero("King Frost", 9999);
        System.out.println(h.getUsername());
        System.out.println(h.getLevel());
        System.out.println();

        MuseElf m = new MuseElf(14);
        System.out.println(m.getUsername());
        System.out.println(m.getLevel());
        System.out.println(m.getPower());
        System.out.println();

        BloodElf e = new BloodElf();
        System.out.println(e.getUsername());
        System.out.println(e.getLevel());
        System.out.println(e.getPower());
    }
}
