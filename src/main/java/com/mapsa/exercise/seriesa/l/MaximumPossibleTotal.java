package com.mapsa.exercise.seriesa.l;

public class MaximumPossibleTotal {
	public static int maxTotal(int[] nums) {
		int[] sorted = sort(nums);
		int sumOf5 = 0;
		for (int i = nums.length - 1; i > nums.length - 6; i--) {
			sumOf5 += nums[i];
		}
		return sumOf5;
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