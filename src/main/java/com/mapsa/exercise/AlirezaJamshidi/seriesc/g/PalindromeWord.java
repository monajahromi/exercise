package com.mapsa.exercise.AlirezaJamshidi.seriesc.g;

import java.util.Arrays;
import java.util.Objects;

public class PalindromeWord {
    public static boolean isPalindrome(String input) {
        if (input.length() > 2) {
            return Objects.equals(0, Character.compare(input.toCharArray()[0], input.toCharArray()[input.length() - 1]))
                    && isPalindrome(String.valueOf(Arrays.copyOfRange(input.toCharArray(), 1, input.length() - 1)));
        } else {
            return input.length() != 2 || input.toCharArray()[0] == input.toCharArray()[1];
        }
    }
}
