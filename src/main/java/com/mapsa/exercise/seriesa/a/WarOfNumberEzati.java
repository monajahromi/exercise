package com.mapsa.exercise.seriesa.a;

public class WarOfNumberEzati {
    public static int warOfNumbers(int[] num) {
//		int resultEven = 0;
//		int resultOdd = 0;
//		for (int i = 0; i < num.length; i++) {
//			if (num[i] % 2 == 0) {
//				resultEven += num[i];
//			} else {
//				resultOdd += num[i];
//
//			}}
//		if (resultEven > resultOdd)
//			return resultEven - resultOdd;
//		else
//			return resultOdd - resultEven;

        int resulEven = 0;
        int resultOdd = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                resulEven += num[i];

            } else {
                resulEven += num[i];

            }
        }
        if (resulEven > resultOdd)
            return resulEven - resultOdd;

    else
        return resultOdd-resulEven;
    }
}