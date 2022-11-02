package com.mapsa.exercise.stream.b;

import java.util.Arrays;

public class RemoveDuplicates {
    public static <T>T[] RemoveDuplicates(T[] inputs){
        inputs = (T[]) Arrays.stream(inputs).distinct().toArray();







        return inputs;

    }
}
