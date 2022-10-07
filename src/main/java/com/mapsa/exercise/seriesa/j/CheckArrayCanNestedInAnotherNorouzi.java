package com.mapsa.exercise.seriesa.j;

import java.util.Arrays;

public class CheckArrayCanNestedInAnotherNorouzi {
	public static boolean canNest(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return (arr1[0]>arr2[0] && arr1[arr1.length-1]< arr2[arr2.length-1]);

	}
}