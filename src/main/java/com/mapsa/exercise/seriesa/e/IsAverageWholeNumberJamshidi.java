package com.mapsa.exercise.seriesa.e;

public class IsAverageWholeNumberJamshidi {

    public static boolean isAvgWhole(int[] arr) {
        long res = 0;
        for (int e : arr) {
            res += e;
        }
        return (res / arr.length) * arr.length == res;
    }
}