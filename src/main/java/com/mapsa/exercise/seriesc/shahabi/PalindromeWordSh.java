package com.mapsa.exercise.seriesc.shahabi;

public class PalindromeWordSh {
    public static boolean isPalindrome(String input, int halfLength) {
        if (halfLength > input.length() / 2) {
            return true;
        }
        return input.charAt(halfLength) == input.charAt
                (input.length() - halfLength - 1) && isPalindrome
                (input, halfLength + 1);
    }
}
