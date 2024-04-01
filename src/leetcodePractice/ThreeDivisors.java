package src.leetcodePractice;

public class ThreeDivisors {

  public static void main(String[] args) {
    int n = 5;
  }

  public static boolean isThree(int n) {
    // initialize a count
    int count = 0;

    // loop to n to check each if the modulo is 0 in each iteration
    // start from 1 to >= n so that 0 is not in the check
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        count++;
      }
    }
    if (count == 3)
      return true;
    return false;
  }
}
