package com.mapsa.exercise.seriesc.g;

public class PalindromeWordJafarian {


    public static boolean palindromeWord(String input) {
        if(input.length() == 0 || input.length() == 1)
            return true;

        if(input.charAt(0) == input.charAt(input.length()-1))

            return palindromeWord(input.substring(1, input.length()-1));

        return false;

    }




}
