package com.mapsa.exercise.stream.j;


import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.IntStream;


public class IndexFiltering {

    public static String indexFiltering(int[] indexes, String input) {

        String[] text ={""};

        Arrays.stream(indexes).forEach(x -> {
            if (x <0)
                text[0]+=String.valueOf(input.charAt(input.length()-Math.abs(x)));
            else    text[0]+=String.valueOf(input.charAt(x));


        });


        return text[0].toLowerCase();
    }


}
