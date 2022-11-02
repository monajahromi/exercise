package com.mapsa.exercise.seriesc.f;

import java.util.Arrays;

public class ConsecutiveNumbersJafarian {


    public static boolean consecutiveNumbers(int[] array) {
        Arrays.sort(array);
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] - array[i - 1] > 1 || array[i] - array[i - 1] == 0)
                return false;
        }

        return true;

    }


}
