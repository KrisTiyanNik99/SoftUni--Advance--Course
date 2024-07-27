package Inheritance.hierarchicalinheritance;

class Cat extends Animal{
    public void meow() {
        System.out.println("meowing...");
    }

    @Override
    public void getFood(String food){
        if(food.equals("fish")){
            System.out.println("Delicious!");
        }
    }
}
