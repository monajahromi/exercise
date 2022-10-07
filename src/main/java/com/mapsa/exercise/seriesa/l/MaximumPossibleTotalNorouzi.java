package com.mapsa.exercise.seriesa.l;

import java.util.Arrays;

public class MaximumPossibleTotalNorouzi {
	public static int maxTotal(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 5; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
}