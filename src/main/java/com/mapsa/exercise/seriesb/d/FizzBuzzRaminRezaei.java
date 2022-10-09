package com.mapsa.exercise.seriesb.d;

public class FizzBuzzRaminRezaei {

	public static String fizzBuzz(int n) {

		if(n%15 == 0){
			return "FizzBuzz" ;
		}
		else if(n%5==0){
			return "Buzz";
		}
		else if(n%3 == 0){
			return "Fizz";
		}
		// write your code here
		return n+"";


	}
}
