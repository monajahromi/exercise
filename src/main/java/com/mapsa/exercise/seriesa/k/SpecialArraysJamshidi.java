package com.mapsa.exercise.seriesa.k;

public class SpecialArraysJamshidi {

    public static boolean isSpecialArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && arr[i] % 2 != 0) {
                return false;
            } else if (i % 2 == 1 && (arr[i] + 1) % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}