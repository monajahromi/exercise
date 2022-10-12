package com.mapsa.exercise.seriesc.shahabi;

public class HarshadNumberSh {
    public static boolean checkHash(int number){
        int sumDigit=sumOfDigits(number);
        int chekHashad=number%sumDigit;
        if(chekHashad==0){
           return true;
        }
        return false;
    }
    public static int sumOfDigits(int number) {
        int digit, sum = 0;
        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }
}
