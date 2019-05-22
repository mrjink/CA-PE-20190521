package p5_shapes;

/**
 * Implementation of a circle with a given radius.
 */
public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public int getNumberOfSides() {
        return 1;
    }

    @Override
    public double getPerimeter() {
        return 2.0d * Math.PI * radius;
    }

    @Override
    public int getNumberOfCorners() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
}
