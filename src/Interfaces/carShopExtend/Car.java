package Interfaces.carShopExtend;

interface Car {
    Integer TIERS = 4;

    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();
}
