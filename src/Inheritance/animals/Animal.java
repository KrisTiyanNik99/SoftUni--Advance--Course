package Inheritance.animals;

class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    private void setName(String name) {
        checkIsValidInput(name);
        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    private void setGender(String gender) {
        checkIsValidInput(gender);
        this.gender = gender;
    }

    public String produceSound() {
        return null;
    }

    private static void checkIsValidInput(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.getClass().getSimpleName()).append(System.lineSeparator());
        sb.append(getName()).append(" ").append(getAge()).append(" ").append(getGender()).append(System.lineSeparator());
        sb.append(produceSound());

        return sb.toString();
    }
}
