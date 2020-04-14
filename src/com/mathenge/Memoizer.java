package com.mathenge;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @author Mathenge on 4/13/2020
 */
public class Memoizer<F, T> {

    private Memoizer() {
    }

    private final Map<F, T> memoizationCache = new HashMap<>();

    private Function<F, T> doMemoization(final Function<F, T> inputFunction) {
        return input -> {
            // Check for previous results
            if (!memoizationCache.containsKey(input)) {
                System.out.println("The key: " + input + " has not been retrived from cache");
                // None exists, so compute and store a new one
                memoizationCache.put(input, inputFunction.apply(input));
            }
            System.out.println("The key: " + input + " has been retrived from cache");
            // At this point a result is guaranteed in the memoization
            return memoizationCache.get(input);
        };
    }

    public static <T, U> Function<T, U> memoize(final Function<T, U> function) {
        return new Memoizer<T, U>().doMemoization(function);
    }
}
