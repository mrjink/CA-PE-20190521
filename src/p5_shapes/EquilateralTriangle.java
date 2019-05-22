package p5_shapes;

/**
 * Implementation of an equilateral triangle with three sides of the same length.
 */
public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double abc) {
        // We could have also used extends IsoscelesTriangle, here, and change the call to super(abc, abc)
        super(abc, abc, abc);
    }
}
