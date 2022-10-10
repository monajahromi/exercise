package com.mapsa.exercise.seriesa.e;

public class IsAverageWholeNumber {
	public static boolean isAvgWhole(int[] arr) {
		Integer sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		Float avg = sum / (float) arr.length;
		String[] splitter = avg.toString().split("\\.");
		if (Integer.valueOf(splitter[1]) == 0)
			return true;
		else
			return false;
	}
}