package Inheritance.person;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(this.name + " is " + this.age + " years old.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
