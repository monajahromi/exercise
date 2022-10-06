package com.mapsa.exercise.seriesa.e;

public class IsAverageWholeNumberShahabi {
    public static boolean isAvgWhole(int[] arr) {
        Integer sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        Float avg = sum / (float) arr.length;
        String[] splitter = avg.toString().split("\\.");
        if (Integer.valueOf(splitter[1]) == 0)
            return true;
        else
            return false;

    }
    }
    /*Double average = null;
        for (int j : arr) {
            Integer sum = 0;
            sum += j;
            average = sum / (double) arr.length;
        }
        String averageStr = Double.toString(average);
        String[] averageSplit = averageStr.split("[.]");
        return averageSplit[1].equals("0");
    }*/