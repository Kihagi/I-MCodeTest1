package com.mathenge;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        //Call isPrime function
        long number = 23;
        PrimeChecker primeChecker = new PrimeChecker();
        long startTime = System.currentTimeMillis(); // start time
        Boolean isprime1 = primeChecker.memoized.apply(number); // lets Do the first call of the function
        long time1 = System.currentTimeMillis() - startTime; // Total Time taken to process
        startTime = System.currentTimeMillis(); // Reset Start time
        Boolean isprime2 = primeChecker.memoized.apply(number); // Call the function a second time
        long time2 = System.currentTimeMillis() - startTime; // Total time taken in the second call
        System.out.println("is "+number+" Prime? "+isprime1+", took this long: "+time1);
        System.out.println("is "+number+" Prime? "+isprime2+", took this long: "+time2);
    }
}
