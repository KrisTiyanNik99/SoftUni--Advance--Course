package DefiningClasses;

import java.util.List;

public class Car {
//    private String brand;
//    private String model;
//    private int hoursPower;
//
//    public Car(String brand, String model, int hoursPower) {
//        this.brand = brand;
//        this.model = model;
//        this.hoursPower = hoursPower;
//    }
//
//    public Car(String brand) {
//        // със "this(аргументите)" ние извикваме оригиналния конструктор - така това ще ни предпази
//        // от това да забравим да добавим нововъведенията във всички конструктури, защото всички използват един
//        this(brand, "unknown", -1);
//    }
//
//        public void setBrand(String brand) {
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
//
//    public String getInfo() {
//        return String.format("The car is: %s %s - %d HP.", brand, model, hoursPower);
//    }
    private String model;
    private String speed;

    public Car(String model, String speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String toString() {

        return String.format("%s %s", this.model, this.speed);
    }
//    private String model;
//    private double fuel;
//    private double fuelCostPerKm;
//    private int distanceTraveled;
//
//    public Car(String model, double fuel, double fuelCostPerKm) {
//        this.model = model;
//        this.fuel = fuel;
//        this.fuelCostPerKm = fuelCostPerKm;
//        this.distanceTraveled = 0;
//    }
//
//    public String getModel() {
//        return this.model;
//    }
//
//    public void drive(int kmToDrive) {
//
//        double requiredFuel = kmToDrive * this.fuelCostPerKm;
//        if (this.fuel >= requiredFuel) {
//            this.fuel -= requiredFuel;
//            this.distanceTraveled += kmToDrive;
//        } else {
//            System.out.println("Insufficient fuel for the drive");
//        }
//    }
//
//    // Този метод показва по какъв начин ще изглежда обект отт този клас във формата на Текст
//    public String toString() {
//        //"{Model} {fuelAmount} {distanceTraveled}"
//        return String.format("%s %.2f %d", this.model, this.fuel, this.distanceTraveled);
//    }
}
