package com.mapsa.exercise.stream.n;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class TripleLetterGroupings {

    public static String[] threeLetterCollection(String input) {
        long skip = 0;
        List<String> letters = new ArrayList<>();
        if (input.length()<3)
            return new String[]{};


        while (skip <= input.length() - 3) {
            letters.add( Arrays.stream(input.split("")).
                    skip(skip++)
                    .limit(3)
                    .collect(Collectors.toList())
                    .stream()
                    .collect(Collectors.joining("")));
        }


        return letters.stream().sorted().toArray(String[]::new);


    }


}
