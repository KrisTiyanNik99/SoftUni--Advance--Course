package DefiningClasses;

import java.util.ArrayList;
import java.util.List;

public class Person {
    //характеристики
//    private String name;
//    private int age;
//
//    //конструктор
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    //Връща стойността на полето name
//    public String getName() {
//        return name;
//    }
//
//    //Връща стойността на полето age
//    public int getAge() {
//        return age;
//    }
//
//    //Връща стойността на обект от този клас във формата на String
//    @Override
//    public String toString() {
//        //връща обектът под формата на текст
//        //обект = тескт "{name} - {age}"
//        return name + " - " + age;
//    }
//    private String name;
//    private Company company;
//    private List<Pokemon> pokemons;
//    private List<Relative> parents;
//    private List<Relative> children;
//    private Car car;
//
//    public Person(String name) {
//        this.name = name;
//        this.pokemons = new ArrayList<>();
//        this.parents = new ArrayList<>();
//        this.children = new ArrayList<>();
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setCompany(Company company) {
//        this.company = company;
//    }
//
//    public void setCar(Car car) {
//        this.car = car;
//    }
//
//    public void addPokemon(Pokemon pokemon) {
//        this.pokemons.add(pokemon);
//    }
//
//    public void addParent(Relative parent) {
//        this.parents.add(parent);
//    }
//
//    public void addChild(Relative child) {
//        this.children.add(child);
//    }
//
//    @Override
//    public String toString() {
//
//        //GeorgeJohnson
//        //Company:
//        //JeleInc Jelior 777.77
//        //Car:
//        //AudiA4 180
//        //Pokemon:
//        //Onyx Rock
//        //Charizard Fire
//        //Parents:
//        //SaraJohnson 13/03/1933
//        //Children:
//        //SamJohnson 01/01/2001
//
//        StringBuilder sb = new StringBuilder();
//        sb.append(this.name).append(System.lineSeparator());
//        sb.append("Company:").append(System.lineSeparator());
//        if (this.company != null) {
//            sb.append(this.company).append(System.lineSeparator());
//        }
//        sb.append("Car:").append(System.lineSeparator());
//        if (this.car != null) {
//            sb.append(this.car).append(System.lineSeparator());
//        }
//        sb.append("Pokemon:").append(System.lineSeparator());
//        if (!this.pokemons.isEmpty()) {
//            this.pokemons.forEach(pokemon -> sb.append(pokemon).append(System.lineSeparator()));
//        }
//        sb.append("Parents:").append(System.lineSeparator());
//        if (!this.parents.isEmpty()) {
//            this.parents.forEach(parent -> sb.append(parent).append(System.lineSeparator()));
//        }
//        sb.append("Children:").append(System.lineSeparator());
//        if (!this.children.isEmpty()) {
//            this.children.forEach(child -> sb.append(child).append(System.lineSeparator()));
//        }
//        return sb.toString();
//    }
    private String name;
    private String birthday;
    private List<Person> parentsList;
    private List<Person> childrenList;

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
        this.parentsList = new ArrayList<>();
        this.childrenList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void addToParentList(Person person) {
        if (isNew(person, parentsList)) {
            this.parentsList.add(person);
        }
    }

    public void addToChildrenList(Person person) {
        if (isNew(person, childrenList)) {
            this.childrenList.add(person);
        }
    }

    public boolean isNew(Person person, List<Person> personList) {
        for (Person p : personList) {
            if (p.equals(person)) {
                return false;
            }
        }
        return true;
    }


    public String getOutputForList(List<Person> list) {
        StringBuilder output = new StringBuilder();

        if (!list.isEmpty()) {
            for (Person p : list) {
                output.append(String.format("%s %s%n", p.getName(), p.getBirthday()));
            }
        }
        return output.toString();
    }

    @Override
    public String toString() {
        return String.format("%s %s%nParents:%n%sChildren:%n%s", name, String.join("/", birthday), getOutputForList(parentsList), getOutputForList(childrenList));
    }
}
