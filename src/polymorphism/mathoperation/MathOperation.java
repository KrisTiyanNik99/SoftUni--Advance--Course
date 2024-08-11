package polymorphism.mathoperation;

class MathOperation {

//    private MathOperation() {
//    }

    public static int add(int a, int b) {

        return a + b;
    }

    public static int add(int a, int b, int c) {
        // this.add(a, b) + c
        return add(add(a, b), c);
    }

    public static int add(int a, int b, int c, int d) {
        // this.add(a, b, c) + d
        // add(add(a, b, c), d)
        return add(add(a, b), add(c, d));
    }
}
