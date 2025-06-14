package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

class FactorizerTest {

  @Test
  void testPrimeFactorsForZeroAndOne() {
    Factorizer factorizer = new Factorizer();
    // Should return empty list for 0
    assertEquals(new ArrayList<>(), factorizer.primeFactors(0));
    // Should return empty list for 1
    assertEquals(new ArrayList<>(), factorizer.primeFactors(1));
  }

  @Test
  void testPrimeFactorsNormalCases() {
    Factorizer factorizer = new Factorizer();

    // 9 = 3 x 3
    ArrayList<Integer> expected9 = new ArrayList<>(Arrays.asList(3, 3));
    assertEquals(expected9, factorizer.primeFactors(9));

    // 10 = 2 x 5
    ArrayList<Integer> expected10 = new ArrayList<>(Arrays.asList(2, 5));
    assertEquals(expected10, factorizer.primeFactors(10));

    // 17 = 17 (prime)
    ArrayList<Integer> expected17 = new ArrayList<>(Arrays.asList(17));
    assertEquals(expected17, factorizer.primeFactors(17));
  }

  @Test
  void testIsPrime() {
    Factorizer factorizer = new Factorizer();

    assertFalse(factorizer.isPrime(36)); 
    assertFalse(factorizer.isPrime(12)); 
    assertTrue(factorizer.isPrime(17)); 
    assertFalse(factorizer.isPrime(1)); 
    assertFalse(factorizer.isPrime(0)); 
  }

  @Test
  void testIsComposite() {
    Factorizer factorizer = new Factorizer();

    assertTrue(factorizer.isComposite(36)); 
    assertTrue(factorizer.isComposite(12)); 
    assertFalse(factorizer.isComposite(17)); 
    assertFalse(factorizer.isComposite(1)); 
    assertFalse(factorizer.isComposite(0)); 
  }

  @Test
  void testReduce() {
    Factorizer factorizer = new Factorizer();

    assertEquals("3", factorizer.reduce(36, 12)); 
    assertEquals("1", factorizer.reduce(12, 12)); 
    assertEquals("6/7", factorizer.reduce(12, 14)); 
    assertEquals("12/37", factorizer.reduce(12, 37)); 
    assertEquals("Undefined", factorizer.reduce(5, 0));
  }
}
