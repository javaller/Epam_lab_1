package task_4;

import java.util.Random;

/**
 * Created by Home on 15.12.2016.
 */

public class Array1 {

    public static float getMaxValue(float[] arr) {
        float max;
        max = arr[0] + arr[arr.length - 1];
        for (int i = 2; i <= arr.length / 2; i++) {
            if (max < arr[i] + arr[arr.length - i + 1]) {
                max = arr[i] + arr[arr.length - i + 1];
            }
            ;
        }
        return max;
    }

    public static void main(String[] args) {
        int n = 100;
        float[] arr = new float[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextFloat();
            System.out.printf("Element № " + i + " is %.2f", arr[i]);
            System.out.println();
        }

        System.out.printf("The max value is %.2f", getMaxValue(arr));
    }
}