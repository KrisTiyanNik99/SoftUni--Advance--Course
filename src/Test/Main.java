package Test;

class Main {
    public static void main(String[] args) {
        InherTestNotAbs n = new InherTestNotAbs();
        n.drink();
        n.drive();
        n.Scream();
        n.Something();

        System.out.println();

        FainalIher f = new FainalIher();
        f.drink();
        f.drive();
        f.Scream();
        f.Something();

        System.out.println();

        AnotherTest b = new AnotherTest();
        b.drink();
        b.drive();
    }
}
