package com.mapsa.exercise.AlirezaJamshidi.seriesc.n;

public class HowManyPrimeNumbersAreThere {
    public static int primeNumbers(int input) {
        if (input < 2) {
            return 0;
        } else {
            int count = 0;
            for (int i = 2; i <= input; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }
            return count;
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
