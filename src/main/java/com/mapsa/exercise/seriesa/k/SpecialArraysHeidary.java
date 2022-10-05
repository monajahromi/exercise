package com.mapsa.exercise.seriesa.k;

public class SpecialArraysHeidary {
	public static boolean isSpecialArray(int[] arr) {
		for (int i = 0; i < arr.length; i += 2) {
			if (arr[i] % 2 != 0)
				return false;
		}
		for (int i = 1; i < arr.length; i += 2) {
			if (arr[i] % 2 == 0)
				return false;

		}
		return true;
	}
}