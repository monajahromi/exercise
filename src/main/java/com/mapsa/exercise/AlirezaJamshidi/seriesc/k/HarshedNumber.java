package com.mapsa.exercise.AlirezaJamshidi.seriesc.k;

public class HarshedNumber {

    public static boolean isHarshed(int input) {
        input = Math.abs(input);
        if (input / 10 == 0) {
            return true;
        } else {
            int number = input, digit, sum = 0;
            while (number > 0) {
                digit = number % 10;
                sum = sum + digit;
                number = number / 10;
            }
            return input % sum == 0;
        }
    }
}
