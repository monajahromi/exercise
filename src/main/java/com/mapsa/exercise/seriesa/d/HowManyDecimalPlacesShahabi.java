package com.mapsa.exercise.seriesa.d;

import java.util.Scanner;

public class HowManyDecimalPlacesShahabi {

    public static int getDecimalPlaces(String num) {
        int indexDot=num.indexOf('.');
        int size=num.length()-1;
        int decimalPlaces=size-indexDot;
        if(indexDot==-1){
            return 0;
        }
        return decimalPlaces;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String decimalNumber = input.next();
        System.out.println(getDecimalPlaces(decimalNumber));
    }
}