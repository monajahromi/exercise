package com.mapsa.exercise.AlirezaJamshidi.seriesa.c;

import com.mapsa.exercise.seriesa.c.Person;

public class GetSumOfPeopleBudget {
    public static double getBudgets(Person[] persons) {
        long res = 0;
        for (Person e : persons) {
            res += e.getBudget();
        }
        return res;
    }
}

