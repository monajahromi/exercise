package com.mapsa.exercise.stream.m;


import java.util.Arrays;


public class RetrieveLastElement {

    public static int[] last(int[] array, int number) {


        if (number < array.length) {
            return Arrays.stream(array)
                    .skip(array.length - number)
                    .toArray();
        } else if (number > array.length) {
            return null;
        } else {
            return new int[]{};
        }


    }


}
