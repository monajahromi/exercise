package com.mapsa.exercise.stream.g;


import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.IntStream;


public class FindAverageLetters {

    public static String findAverageLetters(String[] letters) {

        String[] alphas = {"a", "b", "c",
                "d", "e", "f",
                "g", "h", "i",
                "j", "k", "l",
                "m", "n", "o",
                "p", "q", "r",
                "s", "t", "u",
                "v", "w", "x",
                "y", "z"};

        double average = Arrays.stream(letters).mapToInt(ch -> Arrays.binarySearch(alphas, ch) + 1).sum() / (double) letters.length;
        String s = String.valueOf(average).substring(String.valueOf(average).indexOf(".") + 1);

        return s.length()>1 ? String.format("%.2f", average) : String.valueOf(average);
    }


}
