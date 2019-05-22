package p4_arrays;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        System.out.println("Command line arguments:");
        for (String arg : args) {
            System.out.println(arg);
        }

        oneDimensionalArray();

        twoDimensionalArray();

        arrayOfPrimitives();

    }

    private static void oneDimensionalArray() {
        int[] ints = new int[10];

        ints[0] = 1;
        ints[1] = 2;
        ints[5] = 8;
        ints[6] = (int) 123.65f;
        ints[9] = 654321684;

        System.out.println(Arrays.toString(ints));
    }

    private static void twoDimensionalArray() {
        int[][] chessboard = new int[8][8];

        // This prints the second level of the array as "[I@..."
        System.out.println("toString    : " + Arrays.toString(chessboard));
        // This prints the second level of the array as "[0, 0, ..."
        System.out.println("deepToString: " + Arrays.deepToString(chessboard));
    }

    private static void arrayOfPrimitives() {
        System.out.println("byte   : " + Arrays.toString(new byte[5]));
        System.out.println("short  : " + Arrays.toString(new short[5]));
        System.out.println("int    : " + Arrays.toString(new int[5]));
        System.out.println("long   : " + Arrays.toString(new long[5]));
        System.out.println("float  : " + Arrays.toString(new float[5]));
        System.out.println("double : " + Arrays.toString(new double[5]));
        System.out.println("boolean: " + Arrays.toString(new boolean[5]));
        System.out.println("char   : " + Arrays.toString(new char[5]));
        System.out.println("String : " + Arrays.toString(new String[5]));
    }
}
