package com.mapsa.exercise.stream.h;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class NumbersInStrings {

    public static String[] numbersInStrings(String[] array) {

        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        String[] alphas = {"a", "b",
                "c", "d", "e",
                "f", "g", "h",
                "i", "j", "k",
                "l", "m", "n",
                "o", "p", "q",
                "r", "s", "t",
                "u", "v", "w",
                "x", "y", "z", " "};

        List<String> finds = new ArrayList<>();


        AtomicBoolean checkNumber = new AtomicBoolean(false);
        AtomicBoolean checkAlpha = new AtomicBoolean(false);


        Arrays.stream(array).forEach(ch -> {
            char[] characters = ch.toCharArray();

            IntStream
                    .range(0, characters.length)
                    .mapToObj(x -> String.valueOf(characters[x]))
                    .forEach(c -> {

                        Arrays.stream(alphas).forEach(s -> {
                            if (!checkAlpha.get())
                                checkAlpha.set(s.equals(c));

                        });

                        Arrays.stream(numbers).forEach(s -> {
                            if (!checkNumber.get())
                                checkNumber.set(s.equals(c));

                        });



                    });


            if (checkAlpha.get() && checkNumber.get())
                finds.add(ch);

            checkAlpha.set(false);
            checkNumber.set(false);

        });


        String[] r = finds.toArray(new String[0]);


        return r;


    }


}
