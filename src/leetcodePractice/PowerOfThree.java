package src.leetcodePractice;

public class PowerOfThree {

  public static void main(String[] args) {
    int n = 27;
    System.out.println(isPowerOfThree(n));
  }

  public static boolean isPowerOfThree(int n) {
    // special cases
    if (n <= 0) return false;

    while (n > 0) {
      if (n == 1) return true;
      if (n % 3 != 0) break;
      n /= 3;
    }

    return false;
  }
}
