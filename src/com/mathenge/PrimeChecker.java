package com.mathenge;

import java.util.function.Function;

/**
 * @author Mathenge on 4/13/2020
 */
public class PrimeChecker {

    public boolean isPrime(long input) {
        //2 is a prime number
        if (input == 2) return true;
        //Is num a multiple of 2?
        if (input % 2 == 0) return false;

        for (int i = 3; i * i <= input; i += 2) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }

    private Function<Long, Boolean> PrimeFunction = this::isPrime;
    Function<Long, Boolean> memoized = Memoizer.memoize(PrimeFunction);
}
