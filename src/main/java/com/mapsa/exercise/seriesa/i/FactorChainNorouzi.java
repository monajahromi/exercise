package com.mapsa.exercise.seriesa.i;

public class FactorChainNorouzi {
	public static boolean factorChain(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] % arr[i-1] != 0) return false;
		}
		return true;

	}
}