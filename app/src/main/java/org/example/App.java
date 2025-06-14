package org.example;

public class App {
  public static void main(String[] args) {
    Factorizer factorizer = new Factorizer();

    // test primeFactors method
    System.out.println();
    System.out.println("Prime factors of 0: " + factorizer.primeFactors(0)); // []
    System.out.println("Prime factors of 1: " + factorizer.primeFactors(1)); // []
    System.out.println("Prime factors of 9: " + factorizer.primeFactors(9)); // [3, 3]
    System.out.println("Prime factors of 10: " + factorizer.primeFactors(10)); // [2, 5]
    System.out.println();
    
    // test isPrime method (add-on)
    System.out.println("Is 36 prime? " + factorizer.isPrime(36)); // false
    System.out.println("Is 17 prime? " + factorizer.isPrime(17)); // true
    System.out.println("Is 1 prime? " + factorizer.isPrime(1)); // false
    System.out.println();

    // test isComposite method (add-on)
    System.out.println("Is 36 composite? " + factorizer.isComposite(36)); // true
    System.out.println("Is 17 composite? " + factorizer.isComposite(17)); // false
    System.out.println("Is 1 composite? " + factorizer.isComposite(1)); // false
    System.out.println();

    // test reduce method (add-on)
    System.out.println("Reduce 36/12: " + factorizer.reduce(36, 12)); // 3
    System.out.println("Reduce 12/14: " + factorizer.reduce(12, 14)); // 6/7
    System.out.println("Reduce 12/37: " + factorizer.reduce(12, 37)); // 12/37
    System.out.println();
  }
}
