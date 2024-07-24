package Encapsulation.box;

class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        validateNumber(length, "Length");
        this.length = length;
    }

    private void setWidth(double width) {
        validateNumber(width, "Width");
        this.width = width;
    }

    private void setHeight(double height) {
        validateNumber(height, "Height");
        this.height = height;
    }

    public double calculateSurfaceArea() {
        return  (2 * length * width) + (2 * length * height) + (2 * width * height);
    }
    public double calculateLateralSurfaceArea() {
        return  (2 * length * height) + (2 * width * height);
    }
    public double calculateVolume() {
        return  length * width * height;
    }

    private void validateNumber(double length, String side) {
        if (length <= 0) {
            throw new IllegalArgumentException(side + " cannot be zero or negative.");
        }
    }
}
