package Inheritance.zoo;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("From Animal");
    }

    public String getName() {
        return name;
    }

    protected String getNameMod() {
        return name + " from animal.";
    }
}
