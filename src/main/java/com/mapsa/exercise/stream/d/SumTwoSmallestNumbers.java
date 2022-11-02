package com.mapsa.exercise.stream.d;

import java.util.Arrays;
import java.util.Comparator;

public class SumTwoSmallestNumbers {
    public static int sumTwoSmallestNumbers(int[] input) {





        return Arrays.stream(input)
                .filter(i -> i>0)
                .sorted()
                .limit(2)
                .reduce(0,  Integer::sum);

    }
}
