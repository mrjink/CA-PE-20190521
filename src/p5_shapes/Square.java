package p5_shapes;

/**
 * Implementation of a square with a given side length.
 */
public class Square extends Rectangle {
    public Square(double length) {
        // A square is just a rectangle with sides of the same length.
        super(length, length);
    }

    // We don't need to implement the other methods, since they are implemented in Rectangle.
    // Calling square.getArea(), etc. just works.
}
