package com.mapsa.exercise.stream.i;


import java.util.stream.IntStream;


public class InclusiveArrayRanges {

    public static int[] inclusiveArrayRanges(int startNum, int endNum) {
        if (startNum >= endNum)
            return new int[]{startNum};


        return IntStream.range(startNum, endNum + 1).toArray();
    }


}
