package com.mapsa.exercise.seriesc.shahabi;

public class SevenBoomSh {
    public static String findSeven(String[] array) {
        String str1="Boom";
        String str2="there is no 7 in the array";
        char[] chNumbers=new char[array.length];
        for (int i = 0; i < array.length; i++) {
            String oneOfArray = array[i];

            for (int j = 0; j < oneOfArray.length(); j++) {
                chNumbers[j]=oneOfArray.charAt(j);
                if (chNumbers[j]=='7'){
                    return str1;
                }
            }

        }
        return str2;
    }
}
