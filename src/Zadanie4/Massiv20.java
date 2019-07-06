package Zadanie4;

import java.util.Arrays;
import java.util.Random;

public class Massiv20 {
    public static void main(String[] args) {
        int j = 20;
        int[] array = new int[j];
        Random rand = new Random();
        int i;
        int maxNegative = -11, minPositive = 11, negativePosition = -1, positivePosition = -1;
        for (i = 0; i < j; ++i) {
            int randomInt = rand.nextInt(21) - 10;
            if ((randomInt < 0) && (randomInt > maxNegative)) {
                maxNegative = randomInt;
                negativePosition = i;
            } else if ((randomInt > 0) && (randomInt < minPositive)) {
                minPositive = randomInt;
                positivePosition = i;
            }
            array[i] = randomInt;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(maxNegative + ", " + minPositive);
        System.out.println(negativePosition + ", " + positivePosition);

        int swap = array[negativePosition];
        array[negativePosition] = array[positivePosition];
        array[positivePosition] = swap;

        System.out.println(Arrays.toString(array));

    }
}