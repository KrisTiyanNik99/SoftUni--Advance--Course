package polymorphism.mathoperation;

class Main {
    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();
        int add = mathOperation.add(200, 3);
        System.out.println(add);
        System.out.println(MathOperation.add(2, 2));
        System.out.println(MathOperation.add(3, 3, 3));
        System.out.println(MathOperation.add(4, 4, 4, 4));
    }
}
