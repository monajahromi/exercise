package com.mapsa.exercise.stream.f;


import java.util.Arrays;


public class WeeklySalary {
    public static int weeklySalary(int[] hours) {
        int[] weekends = {hours[5], hours[6]};

        return  Arrays.stream(hours).limit(5).filter(hour -> hour <= 8).map(h -> h * 10).sum() +
                Arrays.stream(hours).limit(5).filter(hour -> hour > 8).map(h -> (8 * 10) + ((h - 8) * 15)).sum() +
                Arrays.stream(weekends).filter(hour -> hour <= 8).map(h -> h * 20).sum() +
                Arrays.stream(weekends).filter(hour -> hour > 8).map(h -> (8 * 20) + ((h - 8) * 30)).sum();
    }


}
