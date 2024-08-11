package Inheritance.animals;

class Cat extends Animal{
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return "Meow meow";
    }

    @Override
    public void Test() {
        super.Test();
    }
}
