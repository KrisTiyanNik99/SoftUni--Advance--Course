package Interfaces.car;

import java.io.Serializable;

interface Car extends Serializable {
    Integer TIERS = 4;

    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();

    default double carPrice(){
        return 200.50;
    }

    static String drive(int power) {
        return "drive....drive with.." + power;
    }
}
