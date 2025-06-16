package org.example;

import java.util.ArrayList;

public class Factorizer {
  // int vs. Integer
  // find all prime factors of a given number n
  public ArrayList<Integer> primeFactors(Integer n) {
    ArrayList<Integer> factors = new ArrayList<>(); // wrapper classes needed for Java data structures

    // If no.is less than or equal to 1, return empty list as per spec
    if (n == null || n <= 1)
      return factors;

    int number = n;
    int divisor = 2; // divide from smallest prime no. 2

    // Loop until no.reduced to 1
    while (number > 1) {
      if (number % divisor == 0) { // check for divisibilty
        factors.add(divisor); // add divisor as prime factor
        number /= divisor; // dividing by divisor to reduce no.
      } else {
        divisor++; // next factor (prime)
      }
    }
    return factors;
  }

  // Add-on 1: check if no. is prime using primeFactors method
  public boolean isPrime(Integer n) {
    // Numbers <= 1 are not prime
    if (n == null || n <= 1)
      return false;

    // get prime factors of n
    ArrayList<Integer> factors = primeFactors(n);

    // a prime num only has itself as prime factor
    return factors.size() == 1 && factors.get(0) == n;
  }

  // Add-on 2: check no. is composite (not prime and > 1)
  public boolean isComposite(Integer n) {
    // Composite means number > 1 and not prime
    return n != null && n > 1 && !isPrime(n);
  }

  // Add-on 3: simplify fractions by prime factors and return string
  public String reduce(int numerator, int denominator) {
    // Cannot divide by zero, so return "Undefined"
    if (denominator == 0)
      return "Undefined";

    // get prime factors of num and deno
    ArrayList<Integer> numFactors = primeFactors(numerator);
    ArrayList<Integer> denFactors = primeFactors(denominator);

    // remove common primefactors from both lists
    for (int i = 0; i < numFactors.size(); i++) {
      Integer factor = numFactors.get(i);
      if (denFactors.contains(factor)) {
        denFactors.remove(factor);
        numFactors.remove(i);
        i--;
      }
    }

    // multiply remaining factors to get simplified numerator
    int reducedNum = 1;
    for (Integer f : numFactors) {
      reducedNum *= f;
    }

    // multiply remaining factors to get simplified denominator
    int reducedDen = 1;
    for (Integer f : denFactors) {
      reducedDen *= f;
    }

    if (reducedDen == 1) {
      return String.valueOf(reducedNum); // Just num if deno is 1
    } else {
      return reducedNum + "/" + reducedDen; // Otherwise return numerator/denominator
    }
  }
}
