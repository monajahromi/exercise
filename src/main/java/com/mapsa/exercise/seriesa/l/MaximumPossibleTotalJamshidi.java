package com.mapsa.exercise.seriesa.l;

public class MaximumPossibleTotalJamshidi {
    public static int maxTotal(int[] nums) {
        long res = 0;
        int i, j;
        for (i = 0; i < 5; i++) {
            for (j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int t = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = t;
                }
            }
            res += nums[j - 1];
        }
        return (int) res;
    }
}