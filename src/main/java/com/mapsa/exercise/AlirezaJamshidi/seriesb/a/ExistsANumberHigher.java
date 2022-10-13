package com.mapsa.exercise.AlirezaJamshidi.seriesb.a;

public class ExistsANumberHigher {
    public static boolean existsHigher(int[] arr, int n) {
        for (int e : arr) {
            if (e >= n) {
                return true;
            }
        }
        return false;
    }
}
