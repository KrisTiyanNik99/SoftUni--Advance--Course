package Inheritance.hierarchicalinheritance;

class Dog extends Animal{
    public void bark() {
        System.out.println("barking...");
    }

    @Override
    public void getFood(String food) {
        if (food.equals("Bones")){
            System.out.println("Nice!");
        }else {
            System.out.println("Ouugh! - " + food);
        }
    }
}
