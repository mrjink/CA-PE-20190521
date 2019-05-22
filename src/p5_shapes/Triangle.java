package p5_shapes;

/**
 * Implementation of a triangle with three given side lengths.
 */
public class Triangle implements Shape {

    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        // Calculate the area using Heron's formula
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public int getNumberOfSides() {
        return 3;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public int getNumberOfCorners() {
        return 3;
    }

    @Override
    public String toString() {
        return "Triangle with sides " + a + ", " + b + ", " + c;
    }
}
