package com.mapsa.exercise.seriesa.j;

import java.util.Arrays;
import java.util.Collections;

public class CheckArrayCanNestedInAnotherShahabi {
	public static boolean canNest(int[] arr1, int[] arr2) {
		if (sort(arr1)[0] > sort(arr2)[0] && sort(arr1)[arr1.length - 1] < sort(arr2)[arr2.length - 1])
			return true;
		else
			return false;
	}

	public static int[] sort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	}
