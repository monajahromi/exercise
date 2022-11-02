package com.mapsa.exercise.seriesc.d;

public class ValidatePinJafarian {

    public static boolean validatePin(String str) {
        boolean check1 = false;
        boolean check2 = false;
        boolean check3 = false;
       /* String pattern = "[^\\s][0-9]\\w{4,6}$";

        if (str.matches(pattern))
            return true;
        else return false;*/


        if (str.length() == 0)
            return false;

        if (str.length()==4 || str.length()==6)
            check1 =true;

        if (str.matches("[0-9]+"))
            check2 = true;

        if (!str.contains(" "))
            check3 = true;






        return check1 && check2 && check3;

    }
}
