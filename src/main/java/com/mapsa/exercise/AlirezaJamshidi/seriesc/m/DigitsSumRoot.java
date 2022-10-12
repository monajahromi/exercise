package com.mapsa.exercise.AlirezaJamshidi.seriesc.m;

public class DigitsSumRoot {
    public static int digitroot (int input) {
        input = Math.abs(input);
        if (input < 10) {
            return input;
        } else {
            int sum = getSum(Math.abs(input));
            while (sum / 10 != 0){
                sum = getSum(sum);
            }
            return sum;
        }
    }

    private static int getSum(int input) {
        int number = input, digit, sum = 0;
        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }
}
