package Inheritance.hierarchicalinheritance;

class Animal {
    public Animal(){
        System.out.println("From Animal");
    }
    public void eat() {
        System.out.println("eating...");
    }

    public void getFood(String food) {
        System.out.println(food);
    }
}
