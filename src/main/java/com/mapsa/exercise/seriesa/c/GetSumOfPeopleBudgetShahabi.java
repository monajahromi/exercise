package com.mapsa.exercise.seriesa.c;

public class GetSumOfPeopleBudgetShahabi {
	
	public static double getBudgets(Person[] persons) {
		double result = new Integer(0);
		for (int i = 0; i < persons.length; i++) {
			result += persons[i].getBudget();
		}
		return result;
	}

}

