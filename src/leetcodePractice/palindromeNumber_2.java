package src.leetcodePractice;

public class palindromeNumber_2 {

  public static void main(String[] args) {
    int x = 12167;

    // Initialize boolean for isPalindrome
    boolean isPalindrome = false;

    // Make a reverse of the x
    // Initialize an int to store reversed x
    int reversed = 0;

    // Initialize temp variable to store the rest of x while we reverse it
    int temp = x;

    while (temp != 0) {
      // Look for the last digit of temp
      int digit = temp % 10;

      // Assign the last digit of temp to reversed
      reversed = reversed * 10 + digit; // rev multiplied by 10 for the position of the digit

      // Divide temp by 10 to discard the last digit and loop through the next iteration
      temp /= 10;
    }

    if (reversed == x) {
      isPalindrome = true;
    }

    System.out.println(isPalindrome);
  }
}
