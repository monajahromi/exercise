package com.mapsa.exercise.stream.o;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class BeginningAndEndParis {

    public static int[][] paris(int[] array) {

        if (array.length == 0)
            return new int[0][0];

        List<List<Integer>> lists = new ArrayList<>();

        int first = 0;
        int end = array.length;
        while (true) {
            int[] arr = IntStream.range(first, end).map(x -> array[x]).toArray();

            int fElement = Arrays.stream(arr).findFirst().getAsInt();

            int eElement = Arrays.stream(arr).skip(arr.length - 1).findFirst().getAsInt();

            lists.add(Arrays.asList(new Integer[]{fElement, eElement}));

            if ((end - first == 2) || (end - first == 1))
                break;

            first++;
            end--;
        }


        return lists.stream()
                .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);

    }


}
