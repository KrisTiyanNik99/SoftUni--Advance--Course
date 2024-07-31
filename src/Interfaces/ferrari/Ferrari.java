package Interfaces.ferrari;

class Ferrari implements Car {
    private static final String MODEL = "488-Spider";

    private String driverName;

    public Ferrari(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverName() {
        return driverName;
    }

    @Override
    public String toString() {
        return "%s/%s/%s/%s".formatted(MODEL, brakes(), gas(), getDriverName());
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }

}
