package src.leetcodePractice;

public class Sqrt {

  public static void main(String[] args) {
    int x = 10;

    System.out.println(mySqrt(x));
  }

  public static int mySqrt(int x) {
    // special cases for 0 and 1
    if (x == 0) return 0;
    if (x == 1) return 1;

    // start binary search
    // intialize high and low point of the search
    long high = x / 2 + 1; // high at this bc sqrt cannot be higher than (x/2+1)
    long low = 1; // low at this bc sqrt cannot be lower than 1

    // loop to find mid until the difference between high and low is 1
    while (high - low != 1) {
      // look for mid
      long mid = low + (high - low) / 2;
      if (mid * mid > x) {
        // if mid^2 is more than x, set high to mid (move to the right)
        high = mid;
      } else {
        // if mid^2 is less than x, set low to mid (move to the left)
        low = mid;
      }
    }

    return (int)low;
  }
}
