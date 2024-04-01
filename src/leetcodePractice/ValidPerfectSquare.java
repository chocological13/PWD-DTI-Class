package src.leetcodePractice;

public class ValidPerfectSquare {

  public static void main(String[] args) {
    int num = 10;

    System.out.println(isPerfectSquare(num));
  }

  public static boolean isPerfectSquare(int num) {
    // special cases
    if (num < 2) return true;

    // use binary search
    long high = num;
    long low = 0;

    while (low < high) {
      long mid = low + (high - low) / 2;
      long square = mid * mid;
      if (square == num) {
        return true;
      } else if (square > num) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    return false;
  }
}
