package com.mapsa.exercise.stream.e;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterRepeatingCharacter {
    public static String[] filterRepeatingCharacter(String[] input) {
        List<String> s = new ArrayList<>();
        Arrays.stream(input).forEach(word -> word
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(i -> i,Collectors.counting())).forEach((k,v) ->{
                    if (v==word.length())
                        s.add(word);
                })


        );



        return s.toArray(new String[0]);


    }


}
