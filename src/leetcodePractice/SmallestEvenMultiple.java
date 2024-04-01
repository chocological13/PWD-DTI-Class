package src.leetcodePractice;

public class SmallestEvenMultiple {

  public static void main(String[] args) {
    int n = 5;
  }

  public static int smallestEvenMultiple(int n) {
    if (n % 2 == 1) {
      return n;
    }
    return n * 2;
  }
}
