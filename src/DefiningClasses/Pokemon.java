package DefiningClasses;

public class Pokemon {
//    private String name;
//    private String element;
//    private int health;
//
//    public Pokemon(String name, String element, int health) {
//        this.name = name;
//        this.element = element;
//        this.health = health;
//    }
//
//    public String getElement() {
//        return this.element;
//    }
//
//    public void loseHealth() {
//        this.health -= 10;
//    }
//
//    public int getHealth() {
//        return this.health;
//    }
    private String name;
    private String type;

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {

        return String.format("%s %s", this.name, this.type);
    }
}
