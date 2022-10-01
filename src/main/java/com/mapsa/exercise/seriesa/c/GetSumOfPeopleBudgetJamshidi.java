package com.mapsa.exercise.seriesa.c;

public class GetSumOfPeopleBudgetJamshidi {
    public static double getBudgets(Person[] persons) {
        long res = 0;
        for (Person e : persons) {
            res += e.getBudget();
        }
        return res;
    }
}

