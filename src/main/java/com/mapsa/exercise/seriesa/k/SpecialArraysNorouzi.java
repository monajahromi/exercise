package com.mapsa.exercise.seriesa.k;

public class SpecialArraysNorouzi {
	public static boolean isSpecialArray(int[] arr) {
		for (int i=0;i<arr.length;i++)
			if (i%2!=arr[i]%2)
				return false;
		return true;
	}
}