package p5_shapes;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // try out some shapes
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(12.0d));
        shapes.add(new Rectangle(4.0d, 5.0d));
        shapes.add(new Square(4.0d));
        shapes.add(new Triangle(3.0d, 4.0d, 5.0d));
        shapes.add(new IsoscelesTriangle(4.0d, 5.0d));
        shapes.add(new EquilateralTriangle(3.0d));

        print(shapes);
    }

    /**
     * Overloaded version of print that takes a List of Shape as argument.
     *
     * @param shapes A list of Shape.
     */
    private static void print(List<Shape> shapes) {
        for (Shape shape : shapes) {
            print(shape);
        }
    }

    /**
     * Overloaded version of print that takes an array of Shape as argument.
     *
     * @param shapes An array of Shape.
     */
    private static void print(Shape... shapes) {
        for (Shape shape : shapes) {
            print(shape);
        }
    }

    /**
     * Overloaded version of print that takes a Shape as argument.
     *
     * @param shape A single Shape.
     */
    private static void print(Shape shape) {
        // Print the shape information as follows:
        // shape.toString()
        // Corners   : x
        // Sides     : x
        // Perimeter : x
        // Area      : x
        System.out.format("%s%nCorners   : %d%nSides     : %d%nPerimeter : %f%nArea      : %f%n%n",
            shape,
            shape.getNumberOfCorners(), shape.getNumberOfSides(),
            shape.getPerimeter(), shape.getArea());
    }
}
