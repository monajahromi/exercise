package com.mapsa.exercise.seriesa.a;

public class WarOfNumbersShahabi {
	  public static int warOfNumbers(int[]numbers) {
		  int resultEven = 0;
		  int resultOdd = 0;
		  for (int i = 0; i < numbers.length; i++) {
			  if (numbers[i] % 2 == 0) {
				  resultEven += numbers[i];
			  } else {
				  resultOdd += numbers[i];

			  }}
			  if (resultEven > resultOdd) {
				  return resultEven - resultOdd;
			  }else {
				  return resultOdd - resultEven;
			  }
		  }
		  }
