package Inheritance.hierarchicalinheritance;

class Cat extends Animal{
    public Cat(String name) {
        System.out.println(name + " is cat...");
    }

    public void meow() {
        System.out.println("meowing...");
    }

    // Ако не се сложи анотация java автоматично прави овъррайд на метода, но е лоша практика да не се слагат анотации
    public void eat() {
        System.out.println("eating from cat....");
    }

    public void eat(String name) {
        System.out.println("No im cat..." + name);
    }

    @Override
    public void getFood(String food){
        if(food.equals("fish")){
            System.out.println("Delicious!");
        }
    }
}
