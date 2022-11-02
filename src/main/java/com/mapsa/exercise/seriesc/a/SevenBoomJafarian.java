package com.mapsa.exercise.seriesc.a;

public class SevenBoomJafarian {
    public static String sevenBoom(int[]numbers){
        for (int num: numbers) {
            String numString = String.valueOf(num);
            if (numString.contains("7"))
                return "Boom!";
        }



        return "there is no 7 in the array";



    }
}
