package com.mapsa.exercise.AlirezaJamshidi.seriesc.h;

public class IsTheInputFactorialOfAnInteger {
    public static boolean isFactorial(int input) {
        if (input < 1) {
            return false;
        } else {
            int target = 1;
            int i = 0;
            while (input > target) {
                i++;
                target *= i;
            }
            return input == target;
        }
    }
}
