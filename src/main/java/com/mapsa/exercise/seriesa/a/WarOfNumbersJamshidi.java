package com.mapsa.exercise.seriesa.a;

public class WarOfNumbersJamshidi {

    public static int warOfNumbers(int[] numbers) {
        long res = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                res += number;
            } else {
                res -= number;
            }
        }
        return (int) Math.abs(res);
    }
}