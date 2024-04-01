package src.leetcodePractice;

public class PowerOfTwo {

  public static void main(String[] args) {
    int n = 16;
    System.out.println(isPowerOfTwo(n));
  }

  public static boolean isPowerOfTwo(int n) {
    // check if it's 0
    if (n == 0) return false;

    // check if it's divisible by 2 with mod
    // at the end of this loop, if it's a power of 2,
    // n will be 1 (the last one will be 2 / 2)
    while (n > 0) {
      // if it's 1 true
      if (n == 1) return true;

      // if it isn't divisible by 2, it's not a power of 2
      if (n % 2 != 0) break;

      // if it is, divide it by 2
      n /= 2;
    }
    return false;
  }
}
