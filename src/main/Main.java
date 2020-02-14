package main;

import static java.lang.System.out;

public class Main {

  public static void main(String[] args) {
    int result = sumAllDigits(999L);
    out.println(result);
    int result2 = findNearestInt(new int[]{1, 44, 56}, 54);
    out.println(result2);
  }

  private static int sumAllDigits(Long input) {
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

  private static int findNearestInt(int[] arr, int input) {
    int midPosition = arr.length / 2;
    // TODO
    return 0;
  }
}
