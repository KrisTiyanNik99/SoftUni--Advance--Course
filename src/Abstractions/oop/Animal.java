package Abstractions.oop;

class Animal {
    private String name;
    private int weight;
    private String kind;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    protected Animal(String name, int weight, String kind) {
        this.name = name;
        this.weight = weight;
        this.kind = kind;
    }

    protected String getName() {
        return name;
    }

    protected String getKind() {
        return kind;
    }
}
