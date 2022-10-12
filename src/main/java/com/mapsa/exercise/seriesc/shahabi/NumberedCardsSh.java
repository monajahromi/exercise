package com.mapsa.exercise.seriesc.shahabi;

import java.util.Arrays;
import java.util.Random;

public class NumberedCardsSh {
    public static boolean checkWinner(int[] inputArray,int[]roundArray) {
        int size = inputArray.length;
        Arrays.sort(inputArray);
        Arrays.sort(roundArray);

        int myCase = (inputArray[size - 1] * 10) + inputArray[size - 2];
        System.out.println("my case is:" + " " + myCase);
        int roundCase = (inputArray[size - 1] * 10) + roundArray[size - 2];
        System.out.println("round case is:" + " " + roundCase);
        if (myCase > roundCase) {
            System.out.println("win my case!!");
            return true;
        } else if (myCase == roundCase) {
            System.out.println("you are equal");
            return true;
        }
        System.out.println("win round case");
        return false;
    }

}
