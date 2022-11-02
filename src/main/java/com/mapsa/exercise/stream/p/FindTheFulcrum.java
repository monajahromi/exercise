package com.mapsa.exercise.stream.p;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


public class FindTheFulcrum {

    public static int findFulcrum(int[] array) {
        int index = 1;
        while (true) {
            if (index > array.length)
                break;


            if (IntStream.range(0, index).map(x -> array[x]).sum() ==
                    IntStream.range(index + 1, array.length).map(x -> array[x]).sum())
                return array[index];

            index++;

        }

        return -1;


    }


}
