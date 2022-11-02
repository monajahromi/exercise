package com.mapsa.exercise.stream.k;


import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;


public class CountNumberDuplicateCharacters {

    public static long countNumberDuplicateCharacters(String input) {
        AtomicLong sum = new AtomicLong();


        input.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .forEach((k, v) -> {
                    if (v == 2)
                        sum.addAndGet(1);
                    else if (v > 2) {
                        sum.addAndGet(v - 1);
                    }

                });


        return sum.get();
    }


}
