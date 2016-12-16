package task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunTest {

    public static int getElement(double eps, int n) {
        int i = 0;

        while (((double) 1 / (1 + i * i) > eps) && (i < n)) {
            i++;
        }

        if ((double) 1 / (1 + i * i) < eps) {
            return i;
        } else {
            return -1;
        }
    }

    public static void printPosl(int n) {
        for (int j = 1; j < n; j++) {
            System.out.print((double) 1 / (1 + j * j) + " ");
        }
    }

    public static void main(String[] args) {
        int n = 500;
        double eps = 0.000011;
        System.out.println(RunTest.getElement(eps, n));
        RunTest.printPosl(n);
    }
}