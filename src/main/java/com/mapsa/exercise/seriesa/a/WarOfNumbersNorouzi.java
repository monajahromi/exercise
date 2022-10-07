package com.mapsa.exercise.seriesa.a;

public class WarOfNumbersNorouzi {
	  public static int warOfNumbers(int[]numbers){
		  int sumOdd=0;
		  int sumEven=0;
		  int diff=0;
		  for (int i = 0; i < numbers.length; i++) {
			  if (numbers[i] % 2 == 0) {
				  //System.out.println(number.get(i) + " is even");
				  sumEven += numbers[i];

			  } else {
				  // System.out.println(number.get(i) + " is odd");
				  sumOdd += numbers[i];

			  }

		  }
		  if(sumEven>sumOdd){
			  diff=sumEven-sumOdd;

		  }else{
			  diff=sumOdd-sumEven;

		  }
		  return diff;
			
	  }
}