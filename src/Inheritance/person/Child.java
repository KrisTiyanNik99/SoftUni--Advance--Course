package Inheritance.person;

class Child extends Person{

    public Child(String name, int age) {
        super(name, age);
        System.out.println("From child");
    }

// Няма как да има конструктор без this или super в дъщерния клас
//    public Child(String name) {
//        System.out.println(name);
//    }
}
