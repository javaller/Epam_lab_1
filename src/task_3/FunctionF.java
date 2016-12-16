package task_3;

import static java.lang.StrictMath.cos;
import static java.lang.StrictMath.sin;

/**
 * Created by Home on 15.12.2016.
 */
public class FunctionF {

    public static void printTable(float a, float b, float h) {
        float x;
        int i = 0;
        double y;

        for (x = a; x <= b; x = x + h, i++) {

            System.out.printf(" x = %.1f", x);
            y = cos(2 * x);
            if (y != 0) {
                System.out.printf(" y = %.2f", (sin(2 * x) / cos(2 * x) - 3));
            } else {
                System.out.println("Деление на ноль невозможно!");
            }
            System.out.println(" ");
        }

        if ((x - h) != b) {
            System.out.printf(" x = %.1f", x);
            System.out.printf(" y = %.2f", sin(2 * b) / cos(2 * b) - 3);
        }
    }

    public static void main(String[] args) {
        float a = 2f;
        float b = 7.8f;
        float h = 0.1f;

        printTable(a, b, h);
    }
}