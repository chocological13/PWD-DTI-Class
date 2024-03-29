package src.leetcodePractice;

public class romanToInt_bruteForce {

  public static void main(String[] args) {
    String roman = "XIV";

    System.out.println(romanToInt(roman));

  }

  public static int value(char a) {
    if (a == 'I') {
      return 1;
    } else if (a == 'V') {
      return 5;
    } else if (a == 'X') {
      return 10;
    } else if (a == 'L') {
      return 50;
    } else if (a == 'C') {
      return 100;
    } else if (a == 'D') {
      return 500;
    } else if (a == 'M') {
      return 1000;
    } else {
      return -1;
    }
  }

  public static int romanToInt(String s) {
    // Initialize variable to store the sum
    int sum = 0;

    // Iterate over string s to get the value for s1[i]
    for (int i = 0; i < s.length(); i++) {
      int s1 = value(s.charAt(i));

      // Check if there's a char at the next index, and get s2
      if (i + 1 < s.length()) {
        int s2 = value(s.charAt(i + 1));

        if (s1 >= s2) {
          sum += s1;
        } else {
          sum -= s1;
        }
      } else {
        sum += s1;
      }
    }
    return sum;
  }
}
