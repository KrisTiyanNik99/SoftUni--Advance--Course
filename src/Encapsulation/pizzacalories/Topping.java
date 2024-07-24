package Encapsulation.pizzacalories;

class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if (!toppingType.equals("Meat") && !toppingType.equals("Veggies")
                && !toppingType.equals("Cheese") && !toppingType.equals("Sauce")) {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }

        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(toppingType + " weight should be in the range [1..50].");
        }

        this.weight = weight;
    }

    public double calculateCalories() {
        double coefficientToppingType = 0;

        switch (toppingType) {
            case "Meat" -> coefficientToppingType = 1.2;
            case "Veggies" -> coefficientToppingType = 0.8;
            case "Cheese" -> coefficientToppingType = 1.1;
            case "Sauce" -> coefficientToppingType = 0.9;
        }

        return (2 * weight) * coefficientToppingType;
    }
}
