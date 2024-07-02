package Abstractions.hotelreservations;

public enum DiscountType {
    VIP(0.80),
    SECOND_VISIT(0.90),
    NONE(1.00);

    private final double discount;

    DiscountType(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public static DiscountType fromString(String s) {
        return switch (s) {
            case "VIP" -> VIP;
            case "SecondVisit" -> SECOND_VISIT;
            case "None" -> NONE;
            default -> throw new IllegalStateException("Unsupported discount type: " + s);
        };
    }
}
