package main;

import static java.lang.System.out;

public class Main {

  public static void main(String[] args) {
    int result = sumAllDigit(999L);
    out.println(result);
  }

  private static int sumAllDigit(Long input) {
    long sum;
    do {
      sum = 0;
      while (input > 0) {
        sum += input % 10;
        input /= 10;
      }
      input = sum;
    } while (sum > 9);
    return (int) sum;
  }
}
