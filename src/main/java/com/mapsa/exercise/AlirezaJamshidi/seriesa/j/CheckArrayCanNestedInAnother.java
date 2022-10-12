package com.mapsa.exercise.AlirezaJamshidi.seriesa.j;

public class CheckArrayCanNestedInAnother {
    public static boolean canNest(int[] arr1, int[] arr2) {
        arr1 = getMinMax(arr1);
        arr2 = getMinMax(arr2);
        return arr2[1] > arr1[1] && arr2[0] < arr1[0];
    }

    private static int[] getMinMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int e : arr) {
            if (e > max) {
                max = Math.max(e, max);
            }
            if (e < min) {
                min = Math.min(e, min);
            }
        }
        return new int[]{min, max};
    }
}