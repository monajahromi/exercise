package com.mapsa.exercise.seriesb.f;

public class FormatPhoneNumberRaminRezaei {

	public static String formatPhoneNumber(int[] nums) {
		String result="(" ;
		for(int i=0 ; i<3; i++){
			result+= nums[i] ;
		}
		result+=") " ;
		for(int i=3 ; i<6 ; i++){
			result+=nums[i] ;
		}
		result+="-" ;
		for(int i=6 ; i<nums.length ; i++){
			result+=nums[i] ;
		}
		// write your code here
		return result;
	}
}
