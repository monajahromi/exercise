package com.mapsa.exercise.AlirezaJamshidi.seriesc.o;

import java.util.Arrays;

public class UnmixMyStrings {
    public static String unmix(String input) {
        if (input.length() < 2) {
            return input;
        } else if (input.length() == 2) {
            return input.charAt(1) + "" + input.charAt(0);
        } else {
            char[] inp = input.toCharArray();
            int index = inp.length;
            if (index % 2 == 1) {
                index--;
            }
            for (int i = 0; i < index; i += 2) {
                char temp = inp[i];
                inp[i] = inp[i + 1];
                inp[i + 1] = temp;
            }
            return String.valueOf(inp);
        }
    }
}
