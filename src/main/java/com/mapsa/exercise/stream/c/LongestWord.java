package com.mapsa.exercise.stream.c;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {
    public static String findLongestWord(String input) {
        String word = Arrays.stream(input.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null)
                .toString();


        return word;

    }
}
