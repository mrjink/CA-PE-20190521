package p5_shapes;

/**
 * Implementation of a rectangle with two given side lengths.
 */
public class Rectangle implements Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public int getNumberOfSides() {
        return 4;
    }

    @Override
    public double getPerimeter() {
        return length + length + width + width;
    }

    @Override
    public int getNumberOfCorners() {
        return 4;
    }

    @Override
    public String toString() {
        return "Rectangle with sides " + length + ", " + width;
    }
}
