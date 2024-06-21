package DefiningClasses;

public class Car {
    private String brand;
    private String model;
    private int hoursPower;

    public Car(String brand, String model, int hoursPower) {
        this.brand = brand;
        this.model = model;
        this.hoursPower = hoursPower;
    }

    public Car(String brand) {
        // със "this(аргументите)" ние извикваме оригиналния конструктор - така това ще ни предпази
        // от това да забравим да добавим нововъведенията във всички конструктури, защото всички използват един
        this(brand, "unknown", -1);
    }

    //    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public void setHoursPower(int hoursPower) {
//        this.hoursPower = hoursPower;
//    }

    public String getInfo() {
        return String.format("The car is: %s %s - %d HP.", brand, model, hoursPower);
    }
}
