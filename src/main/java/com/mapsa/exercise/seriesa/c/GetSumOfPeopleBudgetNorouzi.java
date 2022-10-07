package com.mapsa.exercise.seriesa.c;

public class GetSumOfPeopleBudgetNorouzi {
	
	public static double getBudgets(Person[] persons) {
		double sum=0;
		for(Person i:persons){
			sum+=i.getBudget();
		}
		return sum;

	}

}

