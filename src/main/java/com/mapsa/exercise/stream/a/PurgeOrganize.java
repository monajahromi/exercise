package com.mapsa.exercise.stream.a;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PurgeOrganize {
    public static int[] purgeOrganize( int[] numbers){

        numbers = Arrays.stream(numbers)
                .distinct()
                .sorted()
                .toArray();





        return numbers;

    }
}
