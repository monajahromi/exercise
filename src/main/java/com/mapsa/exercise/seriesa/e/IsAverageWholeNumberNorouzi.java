package com.mapsa.exercise.seriesa.e;

public class IsAverageWholeNumberNorouzi {
	public static boolean isAvgWhole(int[] arr) {
		double total = 0;

		for(int i:arr){
			total += i;
		}

		double avg = total / arr.length;

		return avg % 1 == 0;

	}
}