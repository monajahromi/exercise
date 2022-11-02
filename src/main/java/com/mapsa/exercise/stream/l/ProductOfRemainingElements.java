package com.mapsa.exercise.stream.l;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;


public class ProductOfRemainingElements {

    public static boolean canPartition(int[] array) {
        int multi[] = {1};
        Arrays.sort(array);
        boolean result = false;

        if (Math.abs(array[0]) > array[array.length - 1]) {
            Arrays.stream(array)
                    .skip(1)
                    .forEach(i -> multi[0] *= i);

            result = multi[0] == array[0];
        } else {
            Arrays.stream(array)
                    .limit(array.length - 1)
                    .forEach(i -> multi[0] *= i);
            result = multi[0] == array[array.length - 1];
        }



        return result;

    }


}
