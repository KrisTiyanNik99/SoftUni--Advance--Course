package polymorphism.shapes;

class Circle extends Shape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }


    @Override
    public Double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public final Double getRadius() {
        return radius;
    }
}
